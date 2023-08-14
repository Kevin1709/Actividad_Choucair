package co.com.proyecto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegistrationPage extends PageObject {

    public static final Target FIRST_NAME_INPUT = Target.the("First Name input")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last Name input")
            .located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input")
            .located(By.id("email"));
    public static final Target BIRTHDAY_MONTH_SELECT = Target.the("Birthday Month select")
            .located(By.id("birthMonth"));
    public static final Target BIRTHDAY_DAY_SELECT = Target.the("Birthday Day select")
            .located(By.id("birthDay"));
    public static final Target BIRTHDAY_YEAR_SELECT = Target.the("Birthday Year select")
            .located(By.id("birthYear"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Next Location button")
            .locatedBy("[aria-label='Next step - define your location']");

}
