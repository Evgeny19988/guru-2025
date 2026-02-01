package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoqaTest1 {
    @BeforeAll
    static void BeforeAll() {
        Configuration.browser = "Firefox";
        Configuration.browserSize = "1440x900";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void name() {
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue("EvgenyPopov");
        $("#userEmail").setValue("evgenypopov1998@yandex.ru");
        $("#currentAddress").setValue("SPB");
        $("#permanentAddress").setValue("Shuvalova33");
        $("#submit").scrollTo().click();
        $("#submit").shouldBe(visible);
        $("#output #name").shouldHave(text("EvgenyPopov"));
        $("#output  #email").shouldHave(text("evgenypopov1998@yandex.ru"));
    }
}