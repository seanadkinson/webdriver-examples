package webdriver.example.page.meetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.example.page.AbstractPageElement;

public class MeetupLogin extends AbstractPageElement {

    public MeetupLogin(WebElement root) {
        super(root);
    }

    public void loginWith(String email, String password, String name) {
        findDescendant(By.id("email")).sendKeys(email);
        findDescendant(By.id("password")).sendKeys(password + Keys.ENTER);

        // wait to be logged in
        new WebDriverWait(getDriver(), 10)
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='C_header']//a[text()='" + name + "']")
                ));
    }

}
