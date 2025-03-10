package jm.coders;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/new-addres-add.feature",
        plugin = {"pretty","html:out.html"}
)
public class MyStoreTest {
}
