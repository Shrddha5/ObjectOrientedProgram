package ENUM;

public class lab200_Envirment_congrts
{
    public static void main(String[] args) {

        System.out.println(ENVIRMENT.QA.getBaseURL());
        // Here I can write the QA code
        if(ENVIRMENT.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com")){
            System.out.println("Start on QA!!");
        }// take reference from ENVIRMENT enum




    }
}
