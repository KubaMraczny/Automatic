package jm.coders.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {

        private static WebDriver driver;

        public AddressesPage(WebDriver driver){
            this.driver = driver;
        }

        public void addNewAddress(){

           WebElement addNewAddressBTN = driver.findElement(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=address']"));
           addNewAddressBTN.click();
        }
}
