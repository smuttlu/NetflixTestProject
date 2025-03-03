package BaseData;

import io.qameta.allure.Step;

public class UserData {

    String email = "s.muttlu5@gmail.com";
    String pass = "123321ca";

    @Step("Email Alanını Doldurur")
    public String getEmail() {
        return email;
    }

    @Step("Şifre Alanını Doldurur")
    public String getPass() {
        return pass;
    }
}
