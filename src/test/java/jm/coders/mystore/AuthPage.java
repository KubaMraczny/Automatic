package jm.coders.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {

    private WebDriver driver;

    public AuthPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String email, String password){

        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);


        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-login"));
        loginButton.click();

    };


}
