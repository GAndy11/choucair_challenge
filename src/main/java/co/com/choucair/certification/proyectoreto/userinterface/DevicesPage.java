package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target INPUT_DEVICES = Target
            .the("Fill the device input")
            .located(By.xpath("//div[@name='osId']"));

    public static final Target INPUT_VERSION_DEVICE = Target
            .the("Fill the device version input")
            .located(By.xpath("//div[@name='osVersionId']"));

    public static final Target INPUT_lANGUAGE_DEVICE = Target
            .the("Fill the device language input")
            .located(By.xpath("//div[@name='osLanguageId']"));

    public static final Target BUTTON_LAST_STEP = Target
            .the("Click on the last step button")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

}
