package jm.coders.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver){this.driver = driver; }

    public void login(){

        WebElement loginInput = driver.findElement();
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);


        WebElement passwordInput = driver.findElement();
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-login"));
        loginButton.click();

    };


}
