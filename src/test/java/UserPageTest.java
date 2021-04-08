import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserPageTest extends BaseTest {

    private UserPage userPage;

    @BeforeEach
    public void start() {
        driverInit();
        get();
        userPage = Helper.userPage(driver);
    }

    @Test
    void isUserPage() {
    }

    @Test
    void toMusicPage() {
    }
}