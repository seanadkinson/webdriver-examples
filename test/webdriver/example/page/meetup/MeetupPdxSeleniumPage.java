package webdriver.example.page.meetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.example.page.AbstractPage;

import static org.junit.Assert.*;

public class MeetupPdxSeleniumPage extends AbstractPage {

    @Override
    public String getUrl() {
        return "http://www.meetup.com/pdx-se/";
    }

    @Override
    public By getPageReadyBy() {
        return By.xpath("//h1/a/span[text()='pdx Selenium & Test Automation Users Group']");
    }

    public MeetupHeader getHeader() {
        WebElement headerEl = getDriver().findElement(By.id("C_header"));
        assertNotNull(headerEl);
        return new MeetupHeader(headerEl);
    }

    public MeetupEvent findEvent(int n) {
        WebElement eventList = getDriver().findElement(By.id("events-list-module"));
        WebElement eventEl = eventList.findElement(By.xpath(".//li[contains(@class, 'event-item')][" + n + "]"));
        assertNotNull(eventEl);
        return new MeetupEvent(eventEl);
    }

}
