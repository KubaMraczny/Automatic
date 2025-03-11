package jm.coders;

import jm.coders.mystore.AuthPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyingScript {
    private WebDriver driver;
    private AuthPage authPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");



        authPage = new AuthPage(driver);
        authPage.login("dfv46966@jioso.com", "12345");

        }

    @Test
    public void testAddingItemToCart() throws InterruptedException {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement sweaterBTN = driver.findElement(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s']"));
        sweaterBTN.click();

        WebElement dropdownSize = driver.findElement(By.id("group_1"));
        Select select = new Select(dropdownSize);
        select.selectByValue("2");

        WebElement quantityPicker = driver.findElement(By.name("qty"));
        quantityPicker.click();

        Thread.sleep(1000);

        quantityPicker.sendKeys((Keys.BACK_SPACE));
        quantityPicker.sendKeys("5");

        WebElement addToCartBTN = driver.findElement(By.className("add-to-cart"));
        addToCartBTN.click();

        Thread.sleep(1000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("blockcart-modal")));
        wait.until(ExpectedConditions.visibilityOf(modal));

        WebElement cartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show']")
        ));
        cartButton.click();


//        driver.switchTo().frame("myModalLabel");
//        WebElement checkoutButton = driver.findElement(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show']"));
//        checkoutButton.click();

//        WebElement cartButton = driver.findElement(By.cssSelector("a[href='https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show']")));
//        cartButton.click();




    }
}