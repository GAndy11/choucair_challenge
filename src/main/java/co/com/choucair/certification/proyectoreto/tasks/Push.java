package co.com.choucair.certification.proyectoreto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Push implements Task {

    public static Push joinButton() {
        return Tasks.instrumented(Push.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
