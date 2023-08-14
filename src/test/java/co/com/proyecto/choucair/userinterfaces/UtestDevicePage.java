package co.com.proyecto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicePage {
    public static final Target YOUR_COMPUTER = Target.the("Your Computer")
            .located(By.cssSelector("caret pull-right"));
    public static final Target COMPUTER_VERSION_INPUT = Target.the("Computer Version input")
            .located(By.cssSelector("form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched ng-hide"));
    public static final Target COMPUTER_LANGUAGE_INPUT = Target.the("Computer Language input")
            .located(By.cssSelector("form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target NEXT_LAST_STEP = Target.the("Next Location button")
            .locatedBy("[aria-label='Next - final step']");
}
