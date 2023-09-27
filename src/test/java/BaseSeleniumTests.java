import org.junit.jupiter.api.BeforeEach;

public class BaseSeleniumTests {

    @BeforeEach
    public void webDriverSetup() {
        System.setProperty("webdriver.chrome.driver", "/Users/alyonakuropatkina/Downloads/x64/chromedriver");
    }
}
