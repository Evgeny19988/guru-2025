package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoqaTest2 {
    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void Test2() {
            open("/automation-practice-form");
            $("#firstName").setValue("Evgeny");
            $("#lastName").setValue("Popov");
            $("#userEmail").setValue("evgenypopov1998@yandex.ru");
            $(".custom-control-label").click();
            $("#userNumber").setValue("9144210160");
            $(".react-datepicker-wrapper").click();
            $("select.react-datepicker__month-select").selectOption("January");
            $("select.react-datepicker__year-select").selectOption("1998");
            $(".react-datepicker__day--013").click();
            $(".css-1hwfws3 input").setValue("Maths").pressEnter();
            $("label[for='hobbies-checkbox-1']").click();
            $("input#uploadPicture").uploadFile(new File("src/test/resources/test.pdf"));
            $("#currentAddress").setValue("Kazan");
            $("#state").click();
            $("#react-select-3-option-0").click();
            $("#city").click();
            $("#react-select-4-option-0").click();
            $("#submit").click();
            $(".table-responsive").shouldHave(text("Evgeny"), text("Popov"), text("evgenypopov1998@yandex.ru"),
                    text("9144210160"), text("January"), text("1998"), text("13"),  text("Kazan"));
    }
}
