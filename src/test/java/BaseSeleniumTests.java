import org.junit.jupiter.api.BeforeEach;

public class BaseSeleniumTests {

    @BeforeEach
    public void webDriverSetup() {
        System.setProperty("webdriver.chrome.driver", "/Users/alyonakuropatkina/Downloads/chromedriver_mac64 (3)/chromedriver");
    }
}
