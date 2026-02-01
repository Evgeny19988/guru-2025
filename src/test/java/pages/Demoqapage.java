package pages;

import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Demoqapage {
    CalendarComponent calendarComponent = new CalendarComponent();

    public Demoqapage openPage() {
        open("/automation-practice-form");

        return this;
    }
    public Demoqapage setFirstName(String value){
        $("#firstName").setValue("Evgeny");

        return this;
    }
    public Demoqapage setLastName(String value){
        $("#lastName").setValue("Popov");

        return this;
    }
    public Demoqapage setEmail(String value){
        $("#userEmail").setValue("evgenypopov1998@yandex.ru");

        return this;
    }
    public Demoqapage setGender(String value){
        $(".custom-control-label").click();

        return this;
    }
    public Demoqapage setPhone(String value){
        $("#userNumber").setValue("9144210160");

        return this;
    }
    public Demoqapage setBirthDate(String day, String month, String year){
        $(".react-datepicker-wrapper").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

}
