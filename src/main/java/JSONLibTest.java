import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSONLibTest {
    @Given("^I have JSONLib object$")
    public void iHaveJSONLibObject() {
    }

    @When("^I have run reading \"([^\"]*)\"$")
    public void iHaveRunReading(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I have get result after parsing$")
    public void iHaveGetResultAfterParsing() {
    }

    @Then("^I The result should be equals \"([^\"]*)\"$")
    public void iTheResultShouldBeEquals(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
