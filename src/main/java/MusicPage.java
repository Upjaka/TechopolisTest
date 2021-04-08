import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MusicPage {

    WebDriver driver;
    private final By SEARCH_LOCATOR = By.xpath("");
    private final By TRACK_LOCATOR = By.xpath("");


    public MusicPage(WebDriver driver) {
        this.driver = driver;
    }


}
