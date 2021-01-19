package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.AddressPage;
import co.com.choucair.certification.proyectoreto.userinterface.CompletePage;
import co.com.choucair.certification.proyectoreto.userinterface.DevicesPage;
import co.com.choucair.certification.proyectoreto.userinterface.PersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Create implements Task {
    private String firsName, lastName, emailAddress, birthMonth, birthDay, birthYear, city, zipCode, device, deviceVersion, deviceLanguage, password;

    public Create(String firsName, String lastName, String emailAddress, String birthMonth, String birthDay, String birthYear, String city, String zipCode, String device, String deviceVersion, String deviceLanguage, String password) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.city = city;
        this.zipCode = zipCode;
        this.device = device;
        this.deviceVersion = deviceVersion;
        this.deviceLanguage = deviceLanguage;
        this.password = password;
    }

    public static Performable account(String firsName, String lastName, String emailAddress, String birthMonth, String birthDay, String birthYear, String city, String zipCode, String device, String deviceVersion, String deviceLanguage, String password) {
        return Tasks.instrumented(Create.class, firsName, lastName, emailAddress, birthMonth, birthDay, birthYear, city, zipCode, device, deviceVersion, deviceLanguage, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firsName).into(PersonalPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(PersonalPage.INPUT_LAST_NAME),
                Enter.theValue(emailAddress).into(PersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(PersonalPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(PersonalPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(PersonalPage.INPUT_BIRTH_YEAR),
                Click.on(PersonalPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(AddressPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ARROW_DOWN).into(AddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AddressPage.INPUT_CITY),
                Enter.theValue(zipCode).into(AddressPage.INPUT_ZIP),
                Click.on(AddressPage.BUTTON_NEXT_DEVICES),
                Click.on(DevicesPage.BUTTON_LAST_STEP),
                Enter.theValue(password).into(CompletePage.INPUT_PASSWORD),
                Enter.theValue(password).into(CompletePage.INPUT_CONFIRM_PASSWORD),
                Click.on(CompletePage.CHECK_TERMS_USE),
                Click.on(CompletePage.CHECK_SECURITY_POLICY),
                Click.on(CompletePage.BUTTON_COMPLETE_SETUP));
    }
}
