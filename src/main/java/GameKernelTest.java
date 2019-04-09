import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GameKernelTest {
    private static GameKernel gameKernel;
    private String resultAfterCall;
    private int numberOfQuestion;
    private String trueResult;

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

    @When("^I have input number of question (\\d+)$")
    public void iHaveInputNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    @And("^I have call the method that should return true answer$")
    public void iHaveCallTheMethodThatShouldReturnTrueAnswer() {
        trueResult = gameKernel.getTrueAnswer(numberOfQuestion);
    }

    @Then("^I get the answer \"([^\"]*)\"$")
    public void iGetTheAnswer(String result) {
        Assert.assertEquals(trueResult, result);
    }
}
