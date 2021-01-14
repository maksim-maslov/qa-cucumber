package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    public void waitVisibility(By element) {
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    public void click(By element) {
        waitVisibility(element);
        driver.findElement(element).click();;
    }

    public void isElementDisplayed(By element) {
        waitVisibility(element);
        assertTrue(driver.findElement(element).isDisplayed());
    }

    public void waitForType(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void writeText(By element, String text) {
        waitVisibility(element);
        WebElement el = driver.findElement(element);
        el.clear();
        el.sendKeys(text);
    }
}
