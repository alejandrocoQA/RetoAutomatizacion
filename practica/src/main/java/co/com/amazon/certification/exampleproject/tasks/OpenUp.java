package co.com.amazon.certification.exampleproject.tasks;

import co.com.amazon.certification.exampleproject.userinterface.amazonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private amazonPage amazonPage;

    public static OpenUp thePage() {

         return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(amazonPage));

    }
}
