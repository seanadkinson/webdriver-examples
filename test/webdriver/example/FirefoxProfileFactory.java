package webdriver.example;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FirefoxProfileFactory {

    public static FirefoxProfile create() {
        try {
            FirefoxProfile profile = new FirefoxProfile();
            configureProfile(profile);
            return profile;
        } catch (IOException e) {
            throw new RuntimeException("Couldn't create Firefox profile", e);
        }
    }

    private static void configureProfile(FirefoxProfile p) throws IOException {

        // Never update automatically
        p.setPreference("app.update.enabled", false);

        // Never show the updated page
        p.setPreference("browser.startup.homepage_override.mstone", "ignore");

        // Open "about:blank" when starting
        p.setPreference("browser.startup.page", 0);

        // Don't check default browser
        p.setPreference("browser.shell.checkDefaultBrowser", false);

        // Setup FireBug maybe
        configureFirebug(p);
    }

    private static void configureFirebug(FirefoxProfile p) throws IOException {
        String firebugEnabled = System.getenv("FIREBUG_ENABLED");
        String firebugUrl = System.getenv("FIREBUG_URL");
        String firebugVersion = System.getenv("FIREBUG_VERSION");
        String firebugStartOpen = System.getenv("FIREBUG_START_OPEN");

        if ("true".equals(firebugEnabled) && StringUtils.isNotBlank(firebugUrl) && StringUtils.isNotBlank(firebugVersion)) {
            System.out.println("Enabling Firebug");

            File firebug = File.createTempFile("firebug-" + firebugVersion, ".xpi");
            FileUtils.copyURLToFile(new URL(firebugUrl), firebug);
            p.addExtension(firebug);
            p.setPreference("extensions.firebug.currentVersion", firebugVersion);
            if ("true".equals(firebugStartOpen)) {
                p.setPreference("extensions.firebug.allPagesActivation", "on");
            }
            p.setPreference("extensions.firebug.defaultPanelName", "console");
            p.setPreference("extensions.firebug.console.enableSites", true);
            p.setPreference("extensions.firebug.showFirstRunPage", false);
            p.setPreference("extensions.firebug.toolbarCustomizationDone", true);
        }
    }

}
