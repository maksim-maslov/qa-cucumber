package org.example.qa.cucumber.page;

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

    public void waitVisibility(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void click(WebElement element) {
        waitVisibility(element);
        element.click();;
    }

    public void isElementDisplayed(WebElement element) {
        waitVisibility(element);
        assertTrue(element.isDisplayed());
    }

    public void waitForType(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void writeText(WebElement element, String text) {
        waitVisibility(element);
        WebElement el = element;
        el.clear();
        el.sendKeys(text);
    }
}
