package jm.coders;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jm.coders.mystore.AddressesPage;
import jm.coders.mystore.AuthPage;
import jm.coders.mystore.MyAccountPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class NewAddressCucumberSteps {

    private WebDriver driver;
    private AuthPage authPage;
    private MyAccountPage myAccountPage;
    private AddressesPage addressesPage;

@Before
public void setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");

    authPage = new AuthPage(driver);
    authPage.login("dfv46966@jioso.com", "12345");

    myAccountPage = new MyAccountPage(driver);
    myAccountPage.addresses();
}

    @Given("I'm on adding address form")
            public void openAddingAddressForm(){

        addressesPage = new AddressesPage(driver);
        addressesPage.addNewAddress();

    }

    @When("I enter {string}, {string}, {string}, {string}, {string}")
    public void iEnter(String alias, String address, String city, String zipcode, String phone) {
        driver.findElement(By.id("field-alias")).sendKeys(alias);
        driver.findElement(By.id("field-address1")).sendKeys(address);
        driver.findElement(By.id("field-city")).sendKeys(city);
        driver.findElement(By.id("field-postcode")).sendKeys(zipcode);
        driver.findElement(By.id("field-phone")).sendKeys(phone);

    }
    @And("I enter country")
    public void iEnterCountry() {
        WebElement dropdownCountryList = driver.findElement(By.name("id_country"));
        Select select = new Select(dropdownCountryList);
//        select.selectByValue("17");
        select.selectByContainsVisibleText("United Kingdom");
    }

    @And("I click save")
    public void iClickSave() {
        WebElement saveBTN = driver.findElement(By.xpath("//button[@type='submit']"));
        saveBTN.click();
    }

    @Then("I can see success message {string}")
    public void iCanSeeSuccessMessage(String arg0) {
        WebElement successText = driver.findElement(By.className("alert-success"));
        Assert.assertTrue("Alert should be displayed", successText.isDisplayed());
        Assert.assertEquals(arg0, successText.getText());
    }
}
