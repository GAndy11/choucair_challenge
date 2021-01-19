package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target INPUT_CITY = Target
            .the("Fill the city input")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target
            .the("Fill the zip input")
            .located(By.name("zip"));

    public static final Target INPUT_COUNTRY = Target
            .the("Fill the country input")
            .located(By.xpath("//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12 select2-theme-form clear']//div[@class='ui-select']"));

    public static final Target BUTTON_NEXT_LOCATION = Target
            .the("Click on the Next:Location button")
            .located(By.xpath("//form[@name='userForm']//a"));

    public static final Target BUTTON_NEXT_DEVICES = Target
            .the("Click on the Next:Location button")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

}
