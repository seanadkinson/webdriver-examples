package webdriver.example;

import org.junit.Before;
import org.junit.Test;
import webdriver.example.page.PageHelper;
import webdriver.example.page.meetup.MeetupEvent;
import webdriver.example.page.meetup.MeetupPdxSeleniumPage;

import static org.junit.Assert.*;

/**
 *
 */
public class MeetupRsvpPageObjectTest extends BaseSeleniumTest {

    private MeetupPdxSeleniumPage page;

    @Before
    public void setup() {
        page = new MeetupPdxSeleniumPage();
        PageHelper.gotoPage(page);
        page.loginIfNeeded("sean.adkinson@gmail.com", "password", "Sean Adkinson");
    }


    @Test(timeout = TEST_TIMEOUT)
    public void testGoingToNextMeetup() throws Exception {
        MeetupEvent secondEvent = page.findEvent(2);
        assertEquals("Approaching Test Script Maintainability: From Node to Python", secondEvent.getTitle());
        assertTrue(secondEvent.isAttending());

        // What if we wanted to make an assertion about the 3rd event?
    }
    
}
