import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Collections;
import java.util.List;

public class MusicPage {

    WebDriver driver;
    private final By SEARCH_LOCATOR = By.xpath(".//wm-search-input//input");
    private final By TRACK_LOCATOR = By.xpath("");


    public MusicPage(WebDriver driver) {
        this.driver = driver;
    }

    public void find(String musicName) {
        driver.findElement(SEARCH_LOCATOR).sendKeys(musicName);
        driver.findElement(SEARCH_LOCATOR).sendKeys(Keys.ENTER);
    }

    public boolean isMusicPage() {
        return driver.getCurrentUrl().contains("music");
    }

    public List<MusicWrapper> getTracks() {
        if (isElementPresent(TRACK_LOCATOR)) {
            return MusicTransformer.wrap(driver.findElements(TRACK_LOCATOR), driver);
        }
        return Collections.emptyList();
    }
}
