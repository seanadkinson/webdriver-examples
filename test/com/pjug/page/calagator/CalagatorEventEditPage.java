package com.pjug.page.calagator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 */
public class CalagatorEventEditPage {
    
    private WebDriver driver;
    
    @FindBy(id = "event_tag_list")
    private WebElement tagsInputEl;

    public CalagatorEventEditPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void addTag(String tag) {
        String existingTags = tagsInputEl.getAttribute("value");
        String newTags = existingTags + ", meta";
        tagsInputEl.clear();
        tagsInputEl.sendKeys(newTags);
        System.out.println(String.format("Changing tags from \"%s\" to \"%s\"", existingTags, newTags));
    }
    
    
}
