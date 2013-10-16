package webdriver.example.page.calagator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webdriver.example.ThreadWebDriver;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class CalagatorMainPage {
    
    public CalagatorEventPage findEvent(String name) {
        WebDriver driver = ThreadWebDriver.get();
        driver.findElement(By.linkText(name)).click();
        assertThat(driver.getCurrentUrl(), containsString("calagator.org/events/"));
        
        CalagatorEventPage page = new CalagatorEventPage();
        PageFactory.initElements(driver, page);
        return page;
    }
    
    
    public static CalagatorMainPage getThere() {
        WebDriver driver = ThreadWebDriver.get();
        driver.get("http://calagator.org");
        CalagatorMainPage page = new CalagatorMainPage();
        PageFactory.initElements(driver, page);
        return page;
    }
    
}
