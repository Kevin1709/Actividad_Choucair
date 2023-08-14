package co.com.proyecto.choucair.task;

import co.com.proyecto.choucair.userinterfaces.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheWebsite implements Task {

    private final String url;

    public OpenTheWebsite(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} opens the website at {1}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new UtestHomePage())
        );
    }

    public static OpenTheWebsite called(String url) {
        return new OpenTheWebsite(url);
    }
}
