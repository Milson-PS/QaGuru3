
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Milyukov")
                .setUserEmail("milyukov@yandex.ru")
                .setGender("Male")
                .setNumber("0123456789")
                .setDateOfBirth("16", "January", "1993")
                .setSubjects("Computer Science")
                .setHobbies("Music")
                .setPicture("bag.png")
                .setAddress("ул.Ленина")
                .setStateCity("NCR", "Noida")
                .setSubmit()
                .setCheckResult("Pavel", "Milyukov", "milyukov@yandex.ru", "Male",
                        "0123456789", "16 January,1993", "Computer Science", "Music",
                        "bag.png", "ул.Ленина", "NCR", "Noida");


    }

    @Test
    void minimumAmountData() {
        registrationPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Milyukov")
                .setUserEmail("milyukov@yandex.ru")
                .setGender("Male")
                .setNumber("0123456789")
                .setDateOfBirth("16", "January", "1993")
                .setHobbies("Music")
                .setAddress("ул.Ленина")
                .setSubmit()
                .setCheckResultMin("Pavel", "Milyukov", "milyukov@yandex.ru", "Male",
                        "0123456789", "16 January,1993");


    }

    @Test
    void negativeEmail() {
        registrationPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Milyukov")
                .setGender("Male")
                .setNumber("12345")
                .setDateOfBirth("17", "July", "1780")
                .setSubmit();



    }

}