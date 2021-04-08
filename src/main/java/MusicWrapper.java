import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MusicWrapper {
    private WebElement element;
    private WebDriver driver;

    private static final By MUSIC = By.xpath("");

    public MusicWrapper(WebElement element, WebDriver driver) {
        this.driver = driver;
        this.element = element;
    }
}
