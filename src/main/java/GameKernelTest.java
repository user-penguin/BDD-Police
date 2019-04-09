import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GameKernelTest {
    private static GameKernel gameKernel;
    private String resultAfterCall;

    @Given("^I have an object of GameKernel Class$")
    public void iHaveAnObjectOfGameKernelClass() {
        gameKernel = new GameKernel();
    }

    @When("^I call the GetNextQuestion method$")
    public void iCallTheGetNextQuestionMethod() {
        resultAfterCall = gameKernel.getNextQuestion();
    }

    @Then("^I get the question \"([^\"]*)\"$")
    public void iGetTheQuestion(String question) {
        Assert.assertEquals(resultAfterCall, question);
    }

    @When("^I call this method again$")
    public void iCallThisMethodAgain() {
        resultAfterCall = gameKernel.getNextQuestion();
    }
}
