package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certification.proyectoreto.model.UTestDotComData;
import co.com.choucair.certification.proyectoreto.tasks.Create;
import co.com.choucair.certification.proyectoreto.tasks.OpenUp;
import co.com.choucair.certification.proyectoreto.tasks.Push;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestSignUpStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Alexander wants to create account in uTest\\.com$")
    public void thanAlexanderWantsToCreateAccountInUTestCom() {
        OnStage.theActorCalled("Alexander").wasAbleTo(
                OpenUp.thePage(),
                Push.joinButton());
    }

    @When("^he fill the data required for the page$")
    public void heFillTheDataRequiredForThePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.account());
    }

    @Then("^he finally could subscribe in the platform for testers community$")
    public void heFinallyCouldSubscribeInThePlatformForTestersCommunity() {

    }
}
