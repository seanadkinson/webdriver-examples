package webdriver.example.page.meetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.example.page.AbstractPageElement;

public class MeetupEvent extends AbstractPageElement {

    public MeetupEvent(WebElement root) {
        super(root);
    }

    public String getTitle() {
        WebElement eventTitle = findDescendant(By.cssSelector(".event-title a"));
        return eventTitle.getText();
    }

    public boolean isAttending() {
        WebElement rsvpWrap = findDescendant(By.cssSelector(".rsvp-callout-outer"));
        return "I'm attending".equalsIgnoreCase(rsvpWrap.getText());
    }

}
