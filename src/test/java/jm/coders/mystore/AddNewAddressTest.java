package jm.coders.mystore;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddNewAdressTest {
    private static WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testAddingNewAdress(){

        AuthPage loginPage = new AuthPage(driver);
        loginPage.login();



        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.addresses








    };


}
