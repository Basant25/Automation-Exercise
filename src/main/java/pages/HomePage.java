package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    String productName = "Sleeveless Dress";

    //Elements
    By product = By.xpath("//p[text()=\""+productName+"\"][1]");

    By testElement = By.className("img-responsive");

    //Actions

    public void openProduct () {driver.findElement(product).click();}
}
