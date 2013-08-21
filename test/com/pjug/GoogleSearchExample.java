package com.pjug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 */
public class GoogleSearchExample {
    
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        try {
            
            // Open google
            driver.get("http://google.com");
            WebElement searchEl = driver.findElement(By.name("q"));
            
            // Search for PJUG and wait a sec
            searchEl.sendKeys("PJUG");
            Thread.sleep(1000);
            
            // Click PJUG and wait for a bit on the page
            WebElement pjugLink = driver.findElement(By.xpath("//a/em[text()='Portland Java User Group']"));
            pjugLink.click();
            Thread.sleep(5000);
            
        }
        finally {
            // Make sure to always shut down WebDriver in a finally block!
            driver.close();
        }
    }
    
}
