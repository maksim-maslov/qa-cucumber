package org.example.qa.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    String url = "http://aqueous-forest-93594.herokuapp.com/#!/";

//    private By nameField = By.xpath("//*[@data-ng-model='newUser.name']");
//    private By emailField = By.xpath("//*[@data-ng-model='newUser.email']");
//    private By submitButton = By.xpath("//*[@class='btn waves-effect waves-light col s8 offset-s2 orange darken-4']");
//    private By checkField = By.xpath("//*[@class='row list__title']");

    // lazy-load for PageFactory=pattern
    //////////////////////////////
    @FindBy(xpath = "//*[@data-ng-model='newUser.name']")
    private WebElement nameField;

    @FindBy(xpath = "//*[@data-ng-model='newUser.email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@class='btn waves-effect waves-light col s8 offset-s2 orange darken-4']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@class='row list__title']")
    private WebElement checkField;
    //////////////////////////////

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goTo() {
        driver.get(url);
        return this;
    }

    public LoginPage typeLogin(String login) {
        writeText(nameField, login);
        return this;
    }

    public LoginPage typeEmail(String email) {
        writeText(emailField, email);
        return this;
    }

    public LoginPage loginButtonClick() {
        click(submitButton);
        return this;
    }

    public LoginPage isLoginCorrect() {
        isElementDisplayed(checkField);
        return this;
    }

    public LoginPage checkAllElementsOnPagePresent() {
        isElementDisplayed(nameField);
        isElementDisplayed(emailField);
        isElementDisplayed(submitButton);
        return this;
    }
}
