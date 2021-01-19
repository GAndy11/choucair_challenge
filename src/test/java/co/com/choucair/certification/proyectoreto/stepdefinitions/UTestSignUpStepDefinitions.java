package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certification.proyectoreto.model.UTestDotComData;
import co.com.choucair.certification.proyectoreto.questions.Answer;
import co.com.choucair.certification.proyectoreto.tasks.Create;
import co.com.choucair.certification.proyectoreto.tasks.OpenUp;
import co.com.choucair.certification.proyectoreto.tasks.Push;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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
    public void heFillTheDataRequiredForThePage(List<UTestDotComData> uTestDotComData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.account(
                uTestDotComData.get(0).getFirsName(),
                uTestDotComData.get(0).getLastName(),
                uTestDotComData.get(0).getEmailAddress(),
                uTestDotComData.get(0).getBirthMonth(),
                uTestDotComData.get(0).getBirthDay(),
                uTestDotComData.get(0).getBirthYear(),
                uTestDotComData.get(0).getCity(),
                uTestDotComData.get(0).getZipCode(),
                uTestDotComData.get(0).getDevice(),
                uTestDotComData.get(0).getDeviceVersion(),
                uTestDotComData.get(0).getDeviceLanguage(),
                uTestDotComData.get(0).getPassword()
        ));
    }

    @Then("^he finally could subscribe in the platform for testers community$")
    public void heFinallyCouldSubscribeInThePlatformForTestersCommunity(List<UTestDotComData> uTestDotComData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestDotComData.get(0).getWelcomeMessage())));
    }
}
