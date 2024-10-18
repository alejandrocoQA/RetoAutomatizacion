package co.com.amazon.certification.exampleproject.tasks;

import co.com.amazon.certification.exampleproject.userinterface.ObjectSelection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SelectionObject implements Task {


    public static SelectionObject thePage() {

        return Tasks.instrumented(SelectionObject.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("audifonos").into(ObjectSelection.INPUT_OBJECT),Click.on(ObjectSelection.ENTER_BUTTON1),
                Click.on(ObjectSelection.ENTER_BUTTON2),Click.on(ObjectSelection.ENTER_BUTTON3)
        );


    }
}
