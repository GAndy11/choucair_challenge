package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {
    public static final Target INPUT_PASSWORD = Target
            .the("Fill the password input")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target
            .the("Fill the confirm password input")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERMS_USE = Target
            .the("Check the terms of use checkbox")
            .located(By.id("termOfUse"));

    public static final Target CHECK_SECURITY_POLICY = Target
            .the("Check the security policy checkbox")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target
            .the("Click on the complete the setup button")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
