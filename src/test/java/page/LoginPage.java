package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    String url = "http://aqueous-forest-93594.herokuapp.com/#!/";

    private By nameField = By.xpath("//*[@data-ng-model='newUser.name']");
    private By emailField = By.xpath("//*[@data-ng-model='newUser.email']");
    private By submitButton = By.xpath("//*[@class='btn waves-effect waves-light col s8 offset-s2 orange darken-4']");
    private By checkField = By.xpath("//*[@class='row list__title']");

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
