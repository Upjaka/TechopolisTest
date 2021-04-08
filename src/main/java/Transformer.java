import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MusicTransformer {
    public static List<MusicWrapper> wrap(List<WebElement> elements, WebDriver driver) {
        if (elements.isEmpty()) {
            return Collections.<MusicWrapper>emptyList();
        }
        List<MusicWrapper> comments = new ArrayList<MusicWrapper>();
        for (WebElement comment : elements) {
            comments.add(new MusicWrapper(comment, driver));
        }
        return comments;
    }
}
