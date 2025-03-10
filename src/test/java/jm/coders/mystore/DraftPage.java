//package jm.coders.mystore;

//public class DraftPage {

//    //package jm.coders.mystore;
////
////import io.cucumber.java.en.And;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////import org.junit.Assert;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.support.ui.Select;
////
////public class NewAddressSteps {
////
////    private static WebDriver driver;
////
////    @Given("I'm on adding address form")
////
////    public void openAddingAddressForm(WebDriver driver) {
////        this.driver = driver;
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(7)
////        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");
////
////        WebElement addNewAddressBTN = driver.findElement(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=address']"));
////        addNewAddressBTN.click();
////    }
////
////    @When("I enter alias {string}, address {string}, city {string}, zipcode {string}, phone {string}")
////    public void iEnterAll() {
////        driver.findElement(By.id("field-alias")).sendKeys("dom0");
////        driver.findElement(By.id("field-address1")).sendKeys("address0");
////        driver.findElement(By.id("field-city")).sendKeys("city0");
////        driver.findElement(By.id("field-postcode")).sendKeys("00-000");
////        driver.findElement(By.id("field-phone")).sendKeys("1237894");
////
////    }
////
////
////    @When("I enter alias")
////    public void iEnterAlias() {
////
////        WebElement aliasInput = driver.findElement(By.id("field-alias"));
////        aliasInput.click();
////        aliasInput.clear();
////        aliasInput.sendKeys("alias");
////    }
////
////    @And("I enter address")
////    public void iEnterAddress() {
////
////        WebElement aliasInput = driver.findElement(By.id("field-address1"));
////        aliasInput.click();
////        aliasInput.clear();
////        aliasInput.sendKeys("address1");
////    }
////
////    @And("I enter city")
////    public void iEnterCity() {
////
////        WebElement cityInput = driver.findElement(By.id("field-city"));
////        cityInput.click();
////        cityInput.clear();
////        cityInput.sendKeys("city");
////
////    }
////
////    @And("I enter zipcode")
////    public void iEnterZipcode() {
////
////        WebElement postcodeInput = driver.findElement(By.id("field-postcode"));
////        postcodeInput.click();
////        postcodeInput.clear();
////        postcodeInput.sendKeys("postcode");
////
////    }
////
////    @And("I enter country")
////    public void iEnterCountry() {
////
////        WebElement dropdownCountryList = driver.findElement(By.name("id_country"));
////        Select select = new Select(dropdownCountryList);
////        select.selectByValue("17");
////        select.selectByContainsVisibleText("United Kingdom");
////    }
////
////    @And("I enter phone")
////    public void iEnterPhone() {
////
////        WebElement phoneInput = driver.findElement(By.id("field-phone"));
////        phoneInput.click();
////        phoneInput.clear();
////        phoneInput.sendKeys("123456789");
////    }
////
////
////    @And("I click save")
////    public void iClickSave() {
////
////        WebElement saveBTN = driver.findElement(By.xpath("//button[@type='submit']"));
////        saveBTN.click();
////    }
////
////
////    @Then("I can see success message {string}")
////    public void iCanSeeSuccessMessage(String expectedText) {
////        WebElement successText = driver.findElement(By.className("alert-success"));
////        Assert.assertTrue("Alert should be displayed", successText.isDisplayed());
////        Assert.assertEquals(expectedText, successText.getText());
////    }
////
////
////    @When("I enter <alias>, <address>, <city>, <zipcode>, <phone>")
////    public void iEnterAliasAddressCityZipcodePhone() {
////        driver.findElement(By.id("field-alias")).sendKeys();
////        driver.findElement(By.id("field-address1")).sendKeys();
////        driver.findElement(By.id("field-city")).sendKeys();
////        driver.findElement(By.id("field-postcode")).sendKeys();
////        driver.findElement(By.id("field-phone")).sendKeys();
////    }
////}
//}
