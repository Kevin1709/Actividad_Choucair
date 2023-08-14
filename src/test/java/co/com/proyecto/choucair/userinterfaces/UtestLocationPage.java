package co.com.proyecto.choucair.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocationPage {
    public static final Target CITY_INPUT = Target.the("City input")
            .located(By.id("city"));
    public static final Target POSTAL_CODE_INPUT = Target.the("Postal code input")
            .located(By.id("zip"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
                .located(By.cssSelector(".btn.btn-blue.pull-right"));

}
