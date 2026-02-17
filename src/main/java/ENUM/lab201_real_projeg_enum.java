package ENUM;

public class lab201_real_projeg_enum {
    page_input_email("//*[@id=\"login-username\"]") {

    }

    page_input_password("//*[@id=\"login-password\"]") {

    }

    page_button("#btn") {

    }

    private String locator;
    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    } // in above eg vwo web having us,pwd ,btn i find xpath and select locators

}
