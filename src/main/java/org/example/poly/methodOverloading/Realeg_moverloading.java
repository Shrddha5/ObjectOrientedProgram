package org.example.poly.methodOverloading;

public class Realeg_moverloading {
    public static void main(String[] args) {
        WebAutomation t1 = new WebAutomation();
        t1.openBrowser();
        t1.openBrowser("firefox");
    }
}


class WebAutomation{

    void openBrowser(){
        System.out.println("Default browser!!");
    }

    void openBrowser(String browser){
        System.out.println("Starting browser!!" +  browser);
    }

}
