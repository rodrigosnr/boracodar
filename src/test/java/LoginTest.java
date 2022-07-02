import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/Cliente.feature",
        glue = { "" }, monochrome = true, dryRun = false)
public class LoginTest {
}
