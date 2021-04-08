import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicPageTest extends BaseTest {

    private MusicPage musicPage;

    @BeforeEach
    public void start() {
        driverInit();
        get();
        musicPage = Helper.musicPage(driver);
    }

    @Test
    void find() {
        musicPage.find("Queen");
    }
}