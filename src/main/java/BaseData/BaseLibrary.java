package BaseData;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseLibrary extends Browser {

    @Step("Sleep metodu")
    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    @Step("Hover metodu")
    public void hoverMetod(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));

            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();

            System.out.println("Hover işlemi başarıyla gerçekleştirildi.");
        } catch (Exception e) {
            System.out.println("Hover işlemi sırasında hata oluştu: " + e.getMessage());
        }
    }

    public WebElement waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            System.out.println("Ekran görüntüsü alınırken hata oluştu: " + e.getMessage());
            return new byte[0];
        }
    }
}
