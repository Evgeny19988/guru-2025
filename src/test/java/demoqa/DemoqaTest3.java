package demoqa;

import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DemoqaTest3 extends TestBase {
    @Test
    void Test2() {
            demoqapage.openPage()
                    .setFirstName("Evgeny")
                    .setLastName("Popov")
                    .setEmail("evgenypopov1998@yandex.ru")
                    .setGender("")
                    .setPhone("9144210160")
                    .setBirthDate("30", "January", "1998");

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
