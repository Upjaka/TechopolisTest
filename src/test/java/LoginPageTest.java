import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest extends BaseTest {

    private final String username = "89818278029";
    private final String password = "FbDWawnWH";
    private final By MUSIC_BUTTON = By.xpath(".//div[@id='music_toolbar_button']");
    private LoginPage loginPage;

    @BeforeEach
    public void start() {
        driverInit();
        get();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void doLoginTest() {
        UserPage userPage = loginPage.doLogin(username, password);
        assertTrue(userPage.isUserPage());
    }

    @Test
    public void goMusic() {
        UserPage userPage = loginPage.doLogin(username, password);
        userPage.driver.findElement(MUSIC_BUTTON).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(driver.getCurrentUrl().contains("music"));
    }

    @AfterEach
    public void stop() {
        driverDown();
    }
}