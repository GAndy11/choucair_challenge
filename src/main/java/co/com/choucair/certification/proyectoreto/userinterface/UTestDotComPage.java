package co.com.choucair.certification.proyectoreto.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UTestDotComPage extends PageObject {
    public static final Target JOIN_BUTTON = Target
            .the("Button to create an account")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
