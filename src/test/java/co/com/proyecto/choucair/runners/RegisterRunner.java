package co.com.proyecto.choucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@RunWith(SerenityRunner.class)
@CucumberOptions(
    features = "src/test/resources/features/Register/register.feature",
    glue = "co.com.proyecto.choucair.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
     tags = "@RegistroExitoso"
)
public class RegisterRunner {
}
