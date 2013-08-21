package com.pjug.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class AbstractPageElement {
    
    protected WebDriver driver;
    protected WebElement root;

    public AbstractPageElement(WebDriver driver, WebElement root) {
        this.driver = driver;
        this.root = root;
    }
    
}
