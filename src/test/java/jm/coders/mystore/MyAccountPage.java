package jm.coders.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addresses() {
        WebElement addressesButton = driver.findElement(By.id("addresses-link"));
        addressesButton.click();
    }

}