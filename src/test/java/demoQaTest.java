package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class demoQaTest {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";

    }



    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        // ФИО
        $("#firstName").setValue("Pavel");
        $("#lastName").setValue("Milyukov");
        $("#userEmail").setValue("milyukov@yandex.ru");
        // Пол
        $("label[for='gender-radio-1']").click();
        // Телефон
        $("#userNumber").setValue("0123456789");
        // Дата рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--016").click();
        // Предметы
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        // Хоби
        $("label[for='hobbies-checkbox-1']").click();
        // Изображение
        $("#uploadPicture").uploadFromClasspath("bag.png");
        // Адрес
        $("#currentAddress").setValue("ул.Ленина").pressEnter();
        // Страна Город
        $("#state").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#react-select-4-option-2").click();
        // Отправка
        $("#submit").click();



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