package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_xyzHomePage {
    WebDriver driver;

    public P01_xyzHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By customerLogin = By.xpath("(//button)[3]");

    public P01_xyzHomePage selectCustomerLogin() {
        driver.findElement(this.customerLogin).click();
        return this;
    }


}
