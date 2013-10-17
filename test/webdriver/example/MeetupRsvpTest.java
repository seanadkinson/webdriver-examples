package webdriver.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

/**
 *
 */
public class MeetupRsvpTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testGoingToNextMeetup() throws Exception {
        driver.get("http://www.meetup.com/pdx-se/");

        // login
        driver.findElement(By.id("C_header")).findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("email")).sendKeys("sean.adkinson@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password" + Keys.ENTER);

        // wait to be logged in
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='C_header']//a[text()='Sean Adkinson']")
                ));

        // find event
        WebElement eventList = driver.findElement(By.id("events-list-module"));
        WebElement secondEvent = eventList.findElement(By.xpath(".//li[contains(@class, 'event-item')][2]"));
        WebElement eventTitle = secondEvent.findElement(By.cssSelector(".event-title a"));
        assertEquals("Approaching Test Script Maintainability: From Node to Python", eventTitle.getText());

        // check rsvp status
        WebElement rsvpWrap = secondEvent.findElement(By.cssSelector(".rsvp-callout-outer"));
        assertEquals("I'M ATTENDING", rsvpWrap.getText());
    }
    
}
