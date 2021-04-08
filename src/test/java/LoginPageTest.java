import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeEach
    public void start() {
        driverInit();
        get();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void doLoginTest() {
        UserPage userPage = loginPage.signIn(username, password);
        assertTrue(userPage.isUserPage());
    }

    @AfterEach
    public void stop() {
        driverDown();
    }
}