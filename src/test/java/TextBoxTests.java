import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1928x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Mata");
        $("#userEmail").setValue("Mata@gmail.com");
        $("#currentAddress").setValue("Street");
        $("#permanentAddress").setValue("First");
        $("#submit").click();

        $("output").$("#name").shouldHave(text("Mata"));
        $("output").$("#email").shouldHave(text("Mata@gmail.com"));
        $("output").$("#currentAddress").shouldHave(text("Street"));
        $("output").$("#permanentAddress").shouldHave(text("First"));

    }
}
