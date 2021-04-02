import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;
    protected final File login = new File("files/login.txt");
    protected String username;
    protected String password;

    BaseTest() {
        try (BufferedReader br = new BufferedReader(new FileReader(login))) {
            username = br.readLine();
            password = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/alesa/Documents/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void get() {
        driver.manage().window();
        driver.get("https://ok.ru/");
    }

    public void driverDown() {
        driver.quit();
    }
}
