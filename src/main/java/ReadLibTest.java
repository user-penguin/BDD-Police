import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadLibTest {
    private ReadFile readFile;

    @Given("^I have ReadFile object$")
    public void iHaveReadFileObject() {
    }

    @When("^I run reading \"([^\"]*)\"$")
    public void iRunReading(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The result should be equals \"([^\"]*)\"$")
    public void theResultShouldBeEquals(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
