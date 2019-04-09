import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ReadLibTest {
    private ReadFile readFile;
    private String operand;
    private String result;

    @Given("^I have ReadFile object$")
    public void iHaveReadFileObject() {
        readFile = new ReadFile();
    }

    @When("^I run reading \"([^\"]*)\"$")
    public void iRunReading(String path) {
        this.operand = path;
    }

    @And("^I have get result after reading$")
    public void iHaveGetResultAfterReading() {
        this.result = readFile.readFromFile(operand);
    }

    @Then("^The result should be equals \"([^\"]*)\"$")
    public void theResultShouldBeEquals(String trueResult) {
        Assert.assertEquals(result, trueResult.replace("\\n", "\n"));
    }
}
