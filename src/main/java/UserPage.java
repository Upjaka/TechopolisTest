import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    WebDriver driver;
    private final By TOOLBAR_LOCATOR = By.xpath(".//div[contains(@class, 'toolbar')]");
    private final By MUSIC_BUTTON = By.xpath(".//div[@id='music_toolbar_button']");


    UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isUserPage() {
        return (driver.findElement(TOOLBAR_LOCATOR) != null);
    }

    public MusicPage toMusicPage() {
        driver.findElement(MUSIC_BUTTON).click();
        return new MusicPage(driver);
    }
}
