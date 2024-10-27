
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void FillFormTest() {
        registrationPage.openPage()
        .setFirstName("Pavel")
        .setLastName("Milyukov")
        .setUserEmail("milyukov@yandex.ru")
        .setGender("Other")
        .setNumber("0123456789")
        .setDateOfBirth("16", "January", "1993")
        .setSubjects("Computer Science")
        .setHobbies("Music")
        .setPicture("bag.png")
        .setAddress("ул.Ленина")
        .setStateCity("NCR", "Noida")
        .setSubmit();





        // Проверка
        $(".modal-content").shouldHave(text("Pavel"));
        $(".modal-content").shouldHave(text("Milyukov"));
        $(".modal-content").shouldHave(text("Male"));
        $(".modal-content").shouldHave(text("0123456789"));
        $(".modal-content").shouldHave(text("16 January,1993"));
        $(".modal-content").shouldHave(text("Computer Science"));
        $(".modal-content").shouldHave(text("Sports"));
        $(".modal-content").shouldHave(text("bag.png"));
        $(".modal-content").shouldHave(text("ул.Ленина"));
        $(".modal-content").shouldHave(text("NCR"));
        $(".modal-content").shouldHave(text("Noida"));


    }
}