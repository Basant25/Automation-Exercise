package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By productPrice = By.xpath("(//h2[text()='Rs. 1000'])[1]");

}
