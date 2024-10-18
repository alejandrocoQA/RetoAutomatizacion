package co.com.amazon.certification.exampleproject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectVerification extends PageObject {

    public static final Target ENTER_BUTTON4 = Target.the("objeto de compra 4").located(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a"));
}
