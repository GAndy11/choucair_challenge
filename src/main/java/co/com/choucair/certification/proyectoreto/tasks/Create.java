package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.AddressPage;
import co.com.choucair.certification.proyectoreto.userinterface.PersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Create implements Task {
    public static Create account() {
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("test").into(PersonalPage.INPUT_FIRST_NAME),
                Enter.theValue("test").into(PersonalPage.INPUT_LAST_NAME),
                Enter.theValue("cliente@gmail.com").into(PersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("May").from(PersonalPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("15").from(PersonalPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText("1991").from(PersonalPage.INPUT_BIRTH_YEAR),
                Click.on(PersonalPage.BUTTON_NEXT_LOCATION),
                Enter.theValue("Medellin").into(AddressPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ARROW_DOWN).into(AddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AddressPage.INPUT_CITY),
                Enter.theValue("5002").into(AddressPage.INPUT_ZIP),
                Click.on(AddressPage.BUTTON_NEXT_DEVICES));
    }
}
