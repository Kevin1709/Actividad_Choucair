package co.com.proyecto.choucair.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPasswordPage {
    public static final Target PASSWORD_INPUT = Target.the("Password input")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Confirm password input")
            .located(By.id("confirmPassword"));

    public static final Target TERMS_AND_CONDITIONS_CHECKBOX = Target.the("Terms and conditions checkbox")
            .located(By.id("termOfUse"));

    public static final Target SECURITY_POLICY_CHECKBOX = Target.the("Security policy checkbox")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Complete Setup button")
            .locatedBy("[aria-label='Complete Setup']");
}