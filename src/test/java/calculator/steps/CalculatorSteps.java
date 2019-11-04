package calculator.steps;

import calculator.question.TheResult;
import calculator.tasks.AddNumber;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorSteps {
    @Managed(driver = "Appium")
    public WebDriver herMobileDriver;

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The calculator application is opened$")
    public void theCalculatorApplicationIsOpened() throws Throwable {
        theActorCalled("anna").can(BrowseTheWeb.with(herMobileDriver));
    }

    @When("^The user try to make addition between \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserTryToMakeAdditionBetweenSomethingAndSomething(String strArg1, String strArg2) throws Throwable {
        theActorInTheSpotlight().attemptsTo(AddNumber.AddTwoNumber());
    }

    @Then("^The value \"([^\"]*)\" is display in the result$")
    public void theValueSomethingIsDisplayInTheResult(String strArg1) throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheResult.resultOfCalculator(), equalTo("15")));
    }
}
