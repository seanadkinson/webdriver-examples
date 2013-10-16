package webdriver.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.example.ThreadWebDriver;

import java.util.List;

/**
 *
 */
public class AbstractPageElement implements PageElement {

    protected static WebDriver getDriver() {
        return ThreadWebDriver.get();
    }

    protected WebElement root;

    public AbstractPageElement(WebElement root) {
        this.root = root;
    }

    @Override
    public WebElement getRoot() {
        return root;
    }

    protected WebElement findDescendant(By by) {
        List<WebElement> els = root.findElements(by);
        return els.isEmpty() ? null : els.get(0);
    }
}
