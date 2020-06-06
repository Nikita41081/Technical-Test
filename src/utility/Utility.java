package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static WebDriver driver;

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
}
