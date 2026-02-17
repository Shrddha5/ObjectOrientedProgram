package interfaceprog;

public class interface_variable {
    interface Pramod{
        int a = 10;
        String notes = "JAVA";
        void display();
    }

    class Dutta implements Pramod{

        int aa = 10;

        @Override
        public void display() {
            System.out.println(a);// in interface we do not have parent class so we not use super keyword
            System.out.println(this.aa); //we can use this bec it is in same class

        }
    }

    class Somya implements Pramod
    {

        @Override
        public void display() {
            System.out.println(notes);
        }
    }
//interface B{
//
//}
//
//
//interface A implements B{
//
//}
}
