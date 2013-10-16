package webdriver.example.page.calagator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 */
public class CalagatorEventEditPage {
    
    @FindBy(id = "event_tag_list")
    private WebElement tagsInputEl;

    public void addTag(String tag) {
        String existingTags = tagsInputEl.getAttribute("value");
        String newTags = existingTags + ", meta";
        tagsInputEl.clear();
        tagsInputEl.sendKeys(newTags);
        System.out.println(String.format("Changing tags from \"%s\" to \"%s\"", existingTags, newTags));
    }
    
    
}
