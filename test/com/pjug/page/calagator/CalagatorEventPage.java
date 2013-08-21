package com.pjug.page.calagator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class CalagatorEventPage {
    
    private WebDriver driver;
    
    public CalagatorEventPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public CalagatorEventSidebar getSidebar() {
        WebElement sidebarEl = driver.findElement(By.id("event_sidebar"));
        return new CalagatorEventSidebar(driver, sidebarEl);
    }
    
}
