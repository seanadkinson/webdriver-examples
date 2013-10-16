package webdriver.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.String;

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
            
            // Search for selenium group and wait a sec
            searchEl.sendKeys("pdx selenium" + Keys.ENTER);
            Thread.sleep(1000);
            
            // Click meetup and wait for a bit on the page
            WebElement link = driver.findElement(By.xpath("//a/em[text()='pdx Selenium']"));
            link.click();
            Thread.sleep(5000);

            System.out.println("Current title is: " + driver.getTitle());
        }
        finally {
            // Make sure to always shut down WebDriver in a finally block!
            driver.close();
        }
    }
    
}
