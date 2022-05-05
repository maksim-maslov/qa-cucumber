package org.example.qa.cucumber.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.example.qa.cucumber.page.CookPage;
import org.example.qa.cucumber.page.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    private WebDriver driver;
    public LoginPage loginPage;
    public CookPage cookPage;

    public void start() {

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        loginPage = PageFactory.initElements(driver, LoginPage.class);
        cookPage = PageFactory.initElements(driver, CookPage.class);
    }

    public void finish() {
        driver.quit();
    }
}
