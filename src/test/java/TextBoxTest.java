
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TestBase;
import pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest extends TestBase {
    TextBoxPage registrationTest = new TextBoxPage();

    
    @Test
    void registrationTest() {
        registrationTest.openPage()
        .setUserName("Pavel")
        .setUserEmail("milyukov@yandex.ru")
        .setCurrentAdress("Some street 1")
        .setPermamentAdress("Another street 1")
        .setSubmit()
        .setCheckResult("Pavel", "Milyukov",
                "Some street 1", "Another street 1");
    }
}