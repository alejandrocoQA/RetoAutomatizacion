package co.com.amazon.certification.exampleproject.tasks;

import co.com.amazon.certification.exampleproject.userinterface.ObjectSelection;
import co.com.amazon.certification.exampleproject.userinterface.ObjectVerification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerificationObject implements Task {

    public static VerificationObject thePage() {

        return Tasks.instrumented(VerificationObject.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ObjectVerification.ENTER_BUTTON4));


    }
}
