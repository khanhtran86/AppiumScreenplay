package calculator.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NumberPad extends PageObject {
    public static final Target NUMBER_6 = Target.the("First Number")
            .located(MobileBy.id("com.google.android.calculator:id/digit_6"));

    public static final Target PLUS = Target.the("Plus sign")
            .located(MobileBy.id("com.google.android.calculator:id/op_add"));

    public static final Target NUMBER_9 = Target.the("Second Number")
            .located(MobileBy.id("com.google.android.calculator:id/digit_9"));

    public static final Target RESULT = Target.the("Result")
            .located(MobileBy.id("com.google.android.calculator:id/result_preview"));
}
