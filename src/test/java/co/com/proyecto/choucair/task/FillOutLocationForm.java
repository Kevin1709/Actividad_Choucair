package co.com.proyecto.choucair.task;
import co.com.proyecto.choucair.userinterfaces.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutLocationForm implements Task {
    private final String city;
    private final String postalCode;

    public FillOutLocationForm(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public static FillOutLocationForm withData(String city, String postalCode) {
        return instrumented(FillOutLocationForm.class, city, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(UtestLocationPage.CITY_INPUT),
                Enter.theValue(postalCode).into(UtestLocationPage.POSTAL_CODE_INPUT),
                Click.on(UtestLocationPage.NEXT_BUTTON)

        );
    }
}

