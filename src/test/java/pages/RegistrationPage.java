package pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private   SelenideElement firstNameInput = $("#firstName"),
    lastNameInput = $("#lastName"),
    userEmailInput = $("#userEmail"),
    genderWrapper = $("#genterWrapper"),
    userNumberInput = $("#userNumber"),
    subjectsInput = $("#subjectsInput"),
    hobbiesClick = $("#hobbiesWrapper"),
    uploadPicture = $("#uploadPicture"),
    addressInput =  $("#currentAddress"),
    submitClick =  $("#submit");


    public RegistrationPage openPage(){
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--016").click();

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }


    public RegistrationPage setHobbies(String value) {
        hobbiesClick.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }


    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value).pressEnter();
        return this;
    }


    public RegistrationPage setStateCity(String state, String city ) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        return this;
    }

    public RegistrationPage setSubmit( ) {
       submitClick.click();
        return this;
    }

}