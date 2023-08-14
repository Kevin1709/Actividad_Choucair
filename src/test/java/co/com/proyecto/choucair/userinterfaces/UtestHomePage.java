package co.com.proyecto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class UtestHomePage extends PageObject {
    // ... definiciones de elementos y métodos
    public static final Target JOIN_TODAY_BUTTON = Target.the("JOIN TODAY button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));


}