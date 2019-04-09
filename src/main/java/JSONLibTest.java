import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import org.junit.Assert;

public class JSONLibTest {
    private JSONLib jsonLib;
    private String path;
    private String result;
    private int operand1;
    private String result2;

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
        this.result = JSONLib.getText(path);
    }

    @Then("^The result should be correct json$")
    public void theResultShouldBeCorrectJson() {
        JSONObject jsonObject = new JSONObject("{\"kek\": 1}");
        Assert.assertEquals(jsonObject.toString(), result);
    }

    @When("^I have run finding question by id (\\d+) from file \"([^\"]*)\"$")
    public void iHaveRunFindingQuestionByIdFromFile(int arg0, String arg1) {
        this.path = arg1;
        this.operand1 = arg0;
    }

    @And("^I have get result in the form of String$")
    public void iHaveGetResultInTheFormOfString() {
        result2 = JSONLib.findQuestionById(operand1);
    }

    @Then("^The result equals to \"([^\"]*)\"$")
    public void theResultEqualsTo(String arg0) {
        Assert.assertEquals(result2, arg0);
    }
}
