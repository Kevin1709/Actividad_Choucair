package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptTermsAndConditions implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPasswordPage.TERMS_AND_CONDITIONS_CHECKBOX),
                Click.on(UtestPasswordPage.SECURITY_POLICY_CHECKBOX)

        );
    }

    public static AcceptTermsAndConditions withData() {
        return instrumented(AcceptTermsAndConditions.class);
    }
}
