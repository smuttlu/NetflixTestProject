package Pages;

import BaseData.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class SearchPage extends BaseLibrary {

    private By movieElement4 = By.xpath("//p[@class='fallback-text' and text()='Recep Ivedik 4']");

    @Step("Hover Metodu")
    public void hoverOnMovie() {
        try {

            WebElement element = waitForElementToBeVisible(driver.findElement(movieElement4), 10);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            System.out.println("Hover işlemi başarıyla gerçekleştirildi.");
            System.out.println("Hover işlemi sona erdi.");

        } catch (Exception e) {
            System.out.println("Hover işlemi sırasında hata oluştu: " + e.getMessage());
        }
    }

    @Step("Arama Butonuna Tıklanır")
    public SearchPage searchIcon() {

        WebElement searchIcon = driver.findElement(By.cssSelector("[class='searchTab']"));
        searchIcon.click();
        sleep(5000);
        return this;
    }

    public SearchPage waitForRecepIvedik4ToBeVisible() {
        try {
            WebElement element = waitForElementToBeVisible(driver.findElement(movieElement4), 10);
            System.out.println("Recep İvedik 4 filmi sayfada göründü.");
        } catch (Exception e) {
            System.out.println("Recep İvedik 4 filmi görünene kadar beklerken hata oluştu: " + e.getMessage());
        }
        return this;
    }
}
