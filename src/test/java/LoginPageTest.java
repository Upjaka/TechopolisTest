import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
        final File login = new File("files/login.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(login))) {
            final String username = br.readLine();
            final String password = br.readLine();
            UserPage userPage = loginPage.signIn(username, password);
            assertTrue(userPage.isUserPage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void stop() {
        driverDown();
    }
}