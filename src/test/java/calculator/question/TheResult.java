package calculator.question;

import net.serenitybdd.screenplay.Question;

public class TheResult {
    public static Question<String> resultOfCalculator(){return new ResultPreview();}
}
