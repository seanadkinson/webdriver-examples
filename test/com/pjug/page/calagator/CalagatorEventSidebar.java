package com.pjug.page.calagator;

import com.pjug.page.AbstractPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 *
 */
public class CalagatorEventSidebar extends AbstractPageElement {
    
    public CalagatorEventSidebar(WebDriver driver, WebElement root) {
        super(driver, root);
    }

    public CalagatorEventEditPage editEvent() {
        driver.findElement(By.xpath(".//a[text()='edit']")).click();

        CalagatorEventEditPage page = new CalagatorEventEditPage(driver);
        PageFactory.initElements(driver, page);
        return page;
    }
    
}
