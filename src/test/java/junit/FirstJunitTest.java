package junit;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class FirstJunitTest {

    @Test
    void successfulSearchTests() {
        open("https://school.qa.guru/cms/system/login?required=true");
    }
}
