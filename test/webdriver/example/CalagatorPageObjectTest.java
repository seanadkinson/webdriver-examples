package webdriver.example;

import webdriver.example.page.calagator.CalagatorEventEditPage;
import webdriver.example.page.calagator.CalagatorEventPage;
import webdriver.example.page.calagator.CalagatorMainPage;
import org.junit.Test;

/**
 *
 */
public class CalagatorPageObjectTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testAddTagWithPageObject() {
        CalagatorMainPage main = CalagatorMainPage.getThere();
        CalagatorEventPage eventPage = main.findEvent("Portland Java User Group");
        CalagatorEventEditPage editPage = eventPage.getSidebar().editEvent();
        editPage.addTag("meta");
    }
    
}
