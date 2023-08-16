package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ThankYouPage {

    private final By FINAL_TEXT = By.xpath(".//div[@class = 'finalTxt']");

    private BaseFunc baseFunc;

    public ThankYouPage(BaseFunc baseFunc) { this.baseFunc = baseFunc; }

    public void checkFinalText(){
        WebElement finalText = baseFunc.findElement(FINAL_TEXT);
        Assertions.assertEquals( "Thank You for flying with us!", finalText.getText(), "Wrong text!");
    }
}
