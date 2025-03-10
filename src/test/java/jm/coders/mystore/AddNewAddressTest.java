package jm.coders.mystore;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//public class AddNewAddressTest {
//    private static WebDriver driver;
//
//    @Before
//    public void setup(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }

//    @Test
//    public void testAddingNewAddress(){
//        AuthPage authPage = new AuthPage(driver);
//        authPage.login("dfv46966@jioso.com", "12345");
//
//        MyAccountPage myAccountPage = new MyAccountPage(driver);
//        myAccountPage.addresses();
//
//        AddressesPage addressesPage = new AddressesPage(driver);
//        addressesPage.addNewAddress();

//        NewAddressSteps newAddressSteps = new NewAddressSteps();
//        newAddressSteps.openAddingAddressForm(driver);
//        newAddressSteps.iEnterAll();

//        newAddressSteps.iEnterAlias();
//        newAddressSteps.iEnterAddress();
//        newAddressSteps.iEnterCity();
//        newAddressSteps.iEnterZipcode();
//        newAddressSteps.iEnterCountry();
//        newAddressSteps.iEnterPhone();
//        newAddressSteps.iClickSave();








//    @After
//    public void tearDown(){
//        driver.quit();
//    }


//}
