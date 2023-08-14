package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutDeviceForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               SelectFromOptions.byVisibleText("Windows").from(UtestDevicePage.YOUR_COMPUTER),
                SelectFromOptions.byVisibleText("11").from(UtestDevicePage.COMPUTER_VERSION_INPUT),
                SelectFromOptions.byVisibleText("Spanish").from(UtestDevicePage.COMPUTER_LANGUAGE_INPUT),
                Click.on(UtestDevicePage.NEXT_LAST_STEP)
        );
    }
    public static FillOutDeviceForm withData() {
        return instrumented(FillOutDeviceForm.class);
    }
}



