package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {
    public static final Target WELCOME_MESSAGE = Target
            .the("Find the welcome message")
            .located(By.xpath("//h1[contains(text(), 'Welcome to the world's largest community of freelance software testers!')]"));

}
