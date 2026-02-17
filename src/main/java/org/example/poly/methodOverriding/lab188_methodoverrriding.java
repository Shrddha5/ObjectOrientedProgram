package org.example.poly.methodOverriding;

public class lab188_methodoverrriding {
    public static void main(String[] args) {
        Priya p1  = new Priya();
        p1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Priya(); // Dynamic Dispatch /
        f2.home();


        //  Pramod p1 = new Father();
        // When father is getting born, child reference cannot be given to.


    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Priya extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }



}
