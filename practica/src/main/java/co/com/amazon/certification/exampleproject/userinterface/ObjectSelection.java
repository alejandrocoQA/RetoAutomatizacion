package co.com.amazon.certification.exampleproject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectSelection extends PageObject {

    public static final Target INPUT_OBJECT = Target.the("barra de busqueda").located(By.id("twotabsearchtextbox"));
    public static final Target ENTER_BUTTON1 = Target.the("boton de busqueda").located(By.id("nav-search-submit-button"));
    public static final Target ENTER_BUTTON2 = Target.the("objeto de compra 1").located(By.xpath("//*[@id=\"a-autoid-5-announce\"]"));
    public static final Target ENTER_BUTTON3 = Target.the("objeto de compra 2").located(By.xpath("//*[@id=\"a-autoid-6-announce\"]"));

}
