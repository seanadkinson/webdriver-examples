package com.pjug;

import org.junit.Test;

/**
 *
 */
public class CalagatorTest extends BaseSeleniumTest {
    
    @Test(timeout = TEST_TIMEOUT)
    public void testCalagatorEdit() throws Exception {
        driver.get("http://calagator.org");
    }
    
}
