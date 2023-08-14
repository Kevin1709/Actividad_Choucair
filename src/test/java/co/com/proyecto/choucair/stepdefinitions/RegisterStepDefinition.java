package co.com.proyecto.choucair.stepdefinitions;

import co.com.proyecto.choucair.task.*;
import co.com.proyecto.choucair.userinterfaces.UtestDevicePage;
import co.com.proyecto.choucair.userinterfaces.UtestHomePage;
import co.com.proyecto.choucair.userinterfaces.UtestRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegisterStepDefinition {


    @Managed
    WebDriver hisBrowser;

    Actor kevin = Actor.named("Kevin");

    @Given("that you enter the website uTest.com")
    public void thatYouEnterTheWebsiteUTestCom() {
        kevin.whoCan(BrowseTheWeb.with(hisBrowser));
        kevin.attemptsTo(
                Open.browserOn(new UtestHomePage())
        );
    }

    @When("you click on the registration option \\(JOIN TODAY)")
    public void youClickOnRegistrationOption() {
        kevin.attemptsTo(Click.on(UtestHomePage.JOIN_TODAY_BUTTON));
    }

    @Given("fill out the registration form with personal data.")
    public void fillOutTheRegistrationFormWithPersonalData() {
        kevin.attemptsTo(
                FillOutRegistrationForm.withPersonalData());
    }

    @Given("click next to complete the location")
    public void clickNextToCompleteTheLocation() {
        kevin.attemptsTo(
                FillOutLocationForm.withData("Bogotá", "110110")
        );
    }
    @Given("fill in the device information.")
    public void fillInTheDeviceInformation() {
        kevin.attemptsTo(
                Click.on(UtestDevicePage.NEXT_LAST_STEP)
        );
    }
    @Given("create a strong password")
    public void createAStrongPassword() {
        kevin.attemptsTo(
                FillOutPasswordForm.withPersonalData()
        );

    }
    @Given("check the boxes for acceptance of terms")
    public void doNotCheckTheBoxesForAcceptanceOfTerms() {
        kevin.attemptsTo(
                AcceptTermsAndConditions.withData()
        );

    }
    @When("I click complete setup")
    public void iClickCompleteSetup() {
        kevin.attemptsTo(
                ClickCompleteSetup.button()
        );

    }
    @Then("a new user is created successfully.")
    public void aNewUserIsCreatedSuccessfully() {

    }

}
