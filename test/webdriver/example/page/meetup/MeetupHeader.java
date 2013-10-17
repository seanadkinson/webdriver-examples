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

    public boolean isLoggedIn() {
        return getLoginLink() == null;
    }

    private WebElement getLoginLink() {
        return findDescendant(By.linkText("Log in"));
    }

    public MeetupLogin clickLoginLink() {
        WebElement loginLink = getLoginLink();
        loginLink.click();
        WebElement loginPaneEl = new WebDriverWait(getDriver(), 5).until(
                ExpectedConditions.visibilityOfElementLocated(By.id("paneLogin")));
        return new MeetupLogin(loginPaneEl);
    }

}
