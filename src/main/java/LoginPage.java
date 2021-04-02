import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private By LOGIN_LOCATOR = By.xpath(".//input[@id='field_email']");
    private By PASSWORD_LOCATOR = By.xpath(".//input[@id='field_password']");
    private By SIGN_IN_LOCATOR = By.xpath(".//input[@value='Войти в Одноклассники']");

    LoginPage(WebDriver driver) {
        this.driver = driver;
        check();
    }

    protected void check() {
    }

    public UserPage doLogin(String username, String password) {
        driver.findElement(LOGIN_LOCATOR).sendKeys(username);
        driver.findElement(PASSWORD_LOCATOR).sendKeys(password);
        driver.findElement(SIGN_IN_LOCATOR).click();
        return new UserPage(driver);
    }

}
