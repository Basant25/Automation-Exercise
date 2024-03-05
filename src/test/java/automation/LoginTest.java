package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    String validEmail = "basant.boosi@gmail.com";
    String validPassword = "Vois_2561997";
    String invalidEmail = "basant.bosi@gmail.com";
    String invalidPassword = "Vois_256199";


    By emailField= By.name("email");
    By passwordField = By.name("password");
    By loginBtn = By.xpath("(//button[@class='btn btn-default'])[1]");
    By testElement = By.className("img-responsive");
    By errorButton = By.xpath("//p[text()=\"Your email or password is incorrect!\"]");

    @Test
    public void validLogin () {
        driver.findElement(emailField).sendKeys(validEmail);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(testElement).isDisplayed();
        Assert.assertTrue(isDisplayed);

    }

    @Test
    public void invalidLogin () {
        driver.findElement(emailField).sendKeys(invalidEmail);
        driver.findElement(passwordField).sendKeys(invalidPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(errorButton).isDisplayed();
        Assert.assertTrue(isDisplayed);

    }

}
