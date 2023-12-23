package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_CustomerAccount {

    WebDriver driver;
    public P03_CustomerAccount(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginSuccessMsg = By.xpath("//span[@class='fontBig ng-binding']");

    public String expectedLoginUserDissplay(){
        WebElement expectedMsgDisplay = driver.findElement(this.loginSuccessMsg);
        String expectedMsg = expectedMsgDisplay.getText();
        System.out.println("expected msg " + expectedMsg);
        return expectedMsg;
    }
}
