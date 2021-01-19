package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage {
    public static final Target INPUT_FIRST_NAME = Target
            .the("Fill the name input")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target
            .the("Fill the last name input")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target
            .the("Fill the email input")
            .located(By.id("email"));

    public static final Target INPUT_BIRTH_MONTH = Target
            .the("Fill the month of birth input")
            .located(By.id("birthMonth"));

    public static final Target INPUT_BIRTH_DAY = Target
            .the("Fill the day of birth input")
            .located(By.id("birthDay"));

    public static final Target INPUT_BIRTH_YEAR = Target
            .the("Fill the year of birth input")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION = Target
            .the("Click on the Next:Location button")
            .located(By.xpath("//form[@name='userForm']//a"));
}
