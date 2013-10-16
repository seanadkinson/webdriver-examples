package webdriver.example.page;

import org.openqa.selenium.By;

public interface Page {

    String getUrl();

    By getPageReadyBy();

    void onArrival();

    void assertOnPage(String currentUrl);

}
