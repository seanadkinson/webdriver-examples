package com.pjug.page.calagator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class CalagatorMainPage {
    
    private WebDriver driver;

    public CalagatorMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public CalagatorEventPage findEvent(String name) {
        driver.findElement(By.linkText(name)).click();
        assertThat(driver.getCurrentUrl(), containsString("calagator.org/events/"));
        
        CalagatorEventPage page = new CalagatorEventPage(driver);
        PageFactory.initElements(driver, page);
        return page;
    }
    
    
    public static CalagatorMainPage getThere(WebDriver driver) {
        driver.get("http://calagator.org");
        CalagatorMainPage page = new CalagatorMainPage(driver);
        PageFactory.initElements(driver, page);
        return page;
    }
    
}
