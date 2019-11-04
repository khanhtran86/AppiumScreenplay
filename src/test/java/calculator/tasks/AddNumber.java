package calculator.tasks;

import calculator.ui.NumberPad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class AddNumber implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NumberPad.NUMBER_6, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(NumberPad.NUMBER_6),
                WaitUntil.the(NumberPad.PLUS, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(NumberPad.PLUS),
                WaitUntil.the(NumberPad.NUMBER_9, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
                Click.on(NumberPad.NUMBER_9)
        );
    }

    public static AddNumber AddTwoNumber()
    {
        return instrumented(AddNumber.class);
    }
}
