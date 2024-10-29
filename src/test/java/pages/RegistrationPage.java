package qa.guru.pages.components;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import qa.guru.pages.components.TableComponent;

public class RegistrationPage {

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesClick = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            submitClick = $("#submit"),
            checkResult = $(".modal-content"),
            checkResultMin = $(".modal-content");

            TableComponent resultsTable = new TableComponent();



    public RegistrationPage openPage() {
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


    public RegistrationPage setStateCity(String state, String city) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        return this;
    }

    public RegistrationPage setSubmit() {
        submitClick.click();
        return this;
    }

    public RegistrationPage setCheckResult(String FirstName, String LastName, String UserEmail, String Gender,
                                           String Number, String DateOfBirth, String Subjects, String Hobbies,
                                           String Picture, String Address, String State, String StateCity) {
        checkResult.shouldHave(text("Pavel"));
        checkResult.shouldHave(text("Milyukov"));
        checkResult.shouldHave(text("milyukov@yandex.ru"));
        checkResult.shouldHave(text("Male"));
        checkResult.shouldHave(text("0123456789"));
        checkResult.shouldHave(text("16 January,1993"));
        checkResult.shouldHave(text("Computer Science"));
        checkResult.shouldHave(text("Music"));
        checkResult.shouldHave(text("bag.png"));
        checkResult.shouldHave(text("ул.Ленина"));
        checkResult.shouldHave(text("NCR"));
        checkResult.shouldHave(text("Noida"));
        return this;
    }


    public RegistrationPage setCheckResultMin(String FirstName, String LastName, String UserEmail, String Gender,
                                              String Number, String DateOfBirth) {
        checkResultMin.shouldHave(text(FirstName));
        checkResultMin.shouldHave(text(LastName));
        checkResultMin.shouldHave(text(UserEmail));
        checkResultMin.shouldHave(text(Gender));
        checkResultMin.shouldHave(text(Number));
        checkResultMin.shouldHave(text(DateOfBirth));
        return this;
    }
    public RegistrationPage checkResultIsNotVisible() {
        resultsTable.checkTableIsNotVisible();

        return this;

    }
}