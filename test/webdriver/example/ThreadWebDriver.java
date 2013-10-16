package webdriver.example;


import org.openqa.selenium.WebDriver;

/**
 * Used to reference a common WebDriver instance or other data from a single thread, or its child threads.
 */
public class ThreadWebDriver {

    private static final ThreadLocal<WebDriver> threadWebDriver = new InheritableThreadLocal<WebDriver>();

    private ThreadWebDriver() { }

    public static WebDriver get() {
        return threadWebDriver.get();
    }

    public static void set(WebDriver driver) {
        threadWebDriver.set(driver);
    }

    public static void remove() {
        threadWebDriver.remove();
    }

}

