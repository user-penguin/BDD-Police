import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;

public class JSONLibTest {
    private JSONLib jsonLib;
    private String path;
    private JSONObject result;

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

    @Then("^The result should be correct json$")
    public void theResultShouldBeCorrectJson() {

    }
}
