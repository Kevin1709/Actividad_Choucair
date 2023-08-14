package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutRegistrationForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Kevin").into(UtestRegistrationPage.FIRST_NAME_INPUT),
                Enter.theValue("Millan").into(UtestRegistrationPage.LAST_NAME_INPUT),
                Enter.theValue("Ejemplo@Ejemplo.com").into(UtestRegistrationPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText("12").from(UtestRegistrationPage.BIRTHDAY_DAY_SELECT),
                SelectFromOptions.byVisibleText("October").from(UtestRegistrationPage.BIRTHDAY_MONTH_SELECT),
                SelectFromOptions.byVisibleText("2000").from(UtestRegistrationPage.BIRTHDAY_YEAR_SELECT),
                Click.on(UtestRegistrationPage.NEXT_LOCATION_BUTTON)

        );
    }
    public static Performable withPersonalData() {
        return instrumented(FillOutRegistrationForm.class);
    }
}