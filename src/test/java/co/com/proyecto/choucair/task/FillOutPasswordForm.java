package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestPasswordPage;
import co.com.proyecto.choucair.userinterfaces.UtestRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutPasswordForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Colombia2023*").into(UtestPasswordPage.PASSWORD_INPUT),
                Enter.theValue("Colombia2023*").into(UtestPasswordPage.CONFIRM_PASSWORD_INPUT)
        );
    }
    public static Performable withPersonalData() {
        return instrumented(FillOutPasswordForm.class);
    }
}