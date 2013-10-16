package webdriver.example.page.calagator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webdriver.example.page.AbstractPageElement;

/**
 *
 */
public class CalagatorEventSidebar extends AbstractPageElement {
    
    public CalagatorEventSidebar(WebElement root) {
        super(root);
    }

    public CalagatorEventEditPage editEvent() {
        root.findElement(By.xpath(".//a[text()='edit']")).click();

        CalagatorEventEditPage page = new CalagatorEventEditPage();
        PageFactory.initElements(getDriver(), page);
        return page;
    }
    
}
