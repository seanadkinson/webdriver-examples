package webdriver.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 */
@Ignore
public abstract class BaseSeleniumTest {

    protected static WebDriver driver;
    public static final long TEST_TIMEOUT = 60000; 

    @BeforeClass
    public static void setupBrowser() {
        driver = new FirefoxDriver(FirefoxProfileFactory.create());
        ThreadWebDriver.set(driver);
    }

    @AfterClass
    public static void closeBrowser() throws Exception {
        Thread.sleep(3000);
        driver.close();
        ThreadWebDriver.remove();
    }
}
