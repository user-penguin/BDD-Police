import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSONLibTest {
    private JSONLib jsonLib;
    private String path;

    @Given("^I have JSONLib object$")
    public void iHaveJSONLibObject() {
        this.jsonLib = new JSONLib();
    }

    @When("^I have run reading \"([^\"]*)\"$")
    public void iHaveRunReading(String path) {
        this.path = path;
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
