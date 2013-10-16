package webdriver.example.page.calagator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.example.ThreadWebDriver;

/**
 *
 */
public class CalagatorEventPage {
    
    public CalagatorEventSidebar getSidebar() {
        WebElement sidebarEl = ThreadWebDriver.get().findElement(By.id("event_sidebar"));
        return new CalagatorEventSidebar(sidebarEl);
    }
    
}
