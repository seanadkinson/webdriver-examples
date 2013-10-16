package webdriver.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.example.ThreadWebDriver;

public class PageHelper {

    public static void gotoPage(Page page) {
        WebDriver driver = ThreadWebDriver.get();
        driver.get(page.getUrl());
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(page.getPageReadyBy()));
        page.assertOnPage(driver.getCurrentUrl());
    }

}
