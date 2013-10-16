package webdriver.example.page;

import org.openqa.selenium.WebDriver;
import webdriver.example.ThreadWebDriver;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public abstract class AbstractPage implements Page {

    protected static WebDriver getDriver() {
        return ThreadWebDriver.get();
    }

    @Override
    public void onArrival() {
        // Override to do something
    }

    public void assertOnPage(String currentUrl) {
        assertThat(currentUrl, startsWith(getUrl()));
    }

}
