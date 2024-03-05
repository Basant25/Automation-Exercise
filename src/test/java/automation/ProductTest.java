package automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{

    String validEmail = "basant.boosi@gmail.com";
    String validPassword = "Vois_2561997";

    String expectedPrice = "Rs. 1000";
    String productName = "Sleeveless Dress";


    By emailField= By.name("email");
    By passwordField = By.name("password");
    By loginBtn = By.xpath("(//button[@class='btn btn-default'])[1]");

    By product = By.xpath("//p[text()=\""+productName+"\"][1]");
    By productPrice = By.xpath("(//h2[text()='Rs. 1000'])[1]");

    @Test
    public void validateProductPrice() {
        driver.findElement(emailField).sendKeys(validEmail);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(product).click();
        String actualValue = driver.findElement(productPrice).getText();
        Assert.assertEquals(actualValue,expectedPrice);


    }

}
