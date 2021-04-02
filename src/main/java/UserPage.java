import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    WebDriver driver;
    private final By TOOLBAR_LOCATOR = By.xpath(".//div[contains(@class, 'toolbar')]");


    UserPage(WebDriver driver) {
        this.driver = driver;
        check();
    }

    protected void check() {
    }

    public boolean isUserPage() {
        return (driver.findElement(TOOLBAR_LOCATOR) != null);
    }
}
