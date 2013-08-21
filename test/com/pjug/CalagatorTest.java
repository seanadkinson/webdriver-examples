package com.pjug;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class CalagatorTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testCalagatorEdit() throws Exception {
        driver.get("http://calagator.org");
        driver.findElement(By.linkText("Portland Java User Group")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'single_view_right')]//a[text()='edit']")).click();
        
        WebElement tagEl = driver.findElement(By.id("event_tag_list"));
        String existingTags = tagEl.getAttribute("value");
        String newTags = existingTags + ", meta";
        System.out.println(String.format("Tags from %s to %s", existingTags, newTags));
        tagEl.clear();
        tagEl.sendKeys(newTags);
    }
    
}
