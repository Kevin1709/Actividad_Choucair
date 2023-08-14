package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickCompleteSetup implements Task {

    public static ClickCompleteSetup button() {
        return instrumented(ClickCompleteSetup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPasswordPage.COMPLETE_SETUP_BUTTON)
        );
    }
}

