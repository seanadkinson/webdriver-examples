package webdriver.example;

import org.junit.Test;
import webdriver.example.page.PageHelper;
import webdriver.example.page.meetup.MeetupEvent;
import webdriver.example.page.meetup.MeetupPdxSeleniumPage;

import static org.junit.Assert.*;

/**
 *
 */
public class MeetupRsvpPageObjectTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testGoingToNextMeetup() throws Exception {
        MeetupPdxSeleniumPage page = new MeetupPdxSeleniumPage();
        PageHelper.gotoPage(page);

        page.getHeader().loginIfNeeded();
        MeetupEvent secondEvent = page.findEvent(2);
        assertEquals("Approaching Test Script Maintainability: From Node to Python", secondEvent.getTitle());
        assertTrue(secondEvent.isAttending());
    }
    
}
