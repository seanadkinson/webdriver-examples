package webdriver.example.page.meetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.example.page.AbstractPageElement;

public class MeetupHeader extends AbstractPageElement {

    public MeetupHeader(WebElement root) {
        super(root);
    }

    public void loginIfNeeded() {
        WebDriver driver = getDriver();

        WebElement loginLink = findDescendant(By.linkText("Log in"));
        if (loginLink == null) {
            return;
        }

        // login
        loginLink.click();
        driver.findElement(By.id("email")).sendKeys("sean.adkinson@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password" + Keys.ENTER);

        // wait to be logged in
        new WebDriverWait(driver, 5000)
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='C_header']//a[text()='Sean Adkinson']")
                ));
    }

}
