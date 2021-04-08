import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Helper {
    private Helper() {
    }

    public static UserPage userPage(WebDriver driver) {
        final LoginPage lp = new LoginPage(driver);
        final File login = new File("files/login.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(login))) {
            final String username = br.readLine();
            final String password = br.readLine();
            return lp.signIn(username, password);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static MusicPage musicPage(WebDriver driver) {
        final LoginPage lp = new LoginPage(driver);
        final File login = new File("files/login.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(login))) {
            final String username = br.readLine();
            final String password = br.readLine();
            UserPage userPage = lp.signIn(username, password);
            return userPage.toMusicPage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}