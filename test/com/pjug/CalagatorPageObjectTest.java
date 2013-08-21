package com.pjug;

import com.pjug.page.calagator.CalagatorEventEditPage;
import com.pjug.page.calagator.CalagatorEventPage;
import com.pjug.page.calagator.CalagatorMainPage;
import org.junit.Test;

/**
 *
 */
public class CalagatorPageObjectTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testAddTagWithPageObject() {
        CalagatorMainPage main = CalagatorMainPage.getThere(driver);
        CalagatorEventPage eventPage = main.findEvent("Portland Java User Group");
        CalagatorEventEditPage editPage = eventPage.getSidebar().editEvent();
        editPage.addTag("meta");
    }
    
}
