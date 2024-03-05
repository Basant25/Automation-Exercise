package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //Elements

    WebDriver driver;
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By loginBtn = By.xpath("(//button[@class='btn btn-default'])[1]");

    By errorButton = By.xpath("//p[text()=\"Your email or password is incorrect!\"]");

    // Actions
    public void Login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();

    }
}
