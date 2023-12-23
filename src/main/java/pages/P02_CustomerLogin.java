package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P02_CustomerLogin {
    WebDriver driver;
    public P02_CustomerLogin(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginDropDownList = By.xpath("//select[@id='userSelect']");
    private final By loginBtn = By.xpath("//button[@type='submit']");


    public String selectUser(int index){
        WebElement customerElement = driver.findElement(this.loginDropDownList);
        Select customer =new Select(customerElement);
        customer.selectByIndex(index);

        WebElement selectedOption = customer.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println("Actual user logged " + selectedText);

        return selectedText;
    }

    public P02_CustomerLogin clickOnLogin(){
        driver.findElement(this.loginBtn).click();
        return this;
    }

    public String getSelectedUserText(int index){
        WebElement dropDownElement = driver.findElement(this.loginDropDownList);
        Select customer = new Select(dropDownElement);
        WebElement selectedOption = customer.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println(selectedText);
        return selectedText;
    }
}
