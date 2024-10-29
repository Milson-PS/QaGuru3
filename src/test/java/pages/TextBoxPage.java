package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxPage {

    private SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput =   $("#permanentAddress"),
            submitClick = $("#submit"),
            checkResult = $("#output");



    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAdress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermamentAdress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }


    public TextBoxPage setSubmit() {
        submitClick.click();
        return this;
    }

    public TextBoxPage setCheckResult(String UserName, String UserEmail, String CurrentAddress,
                                      String PermamentAdress ) {
        checkResult.shouldHave(text("Pavel"));
        checkResult.shouldHave(text("Milyukov"));
        checkResult.shouldHave(text("Some street 1"));
        checkResult.shouldHave(text("Another street 1"));
        return this;
    }
}