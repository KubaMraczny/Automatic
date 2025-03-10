package jm.coders;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewAddressCucumberTest {
    private static WebDriver driver;
    @Before
    public void openAuthPage() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");
    }


    @Given("I'm on adding address form")

    }







}
