package com.pjug;

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
    public static void setup() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void teardown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
