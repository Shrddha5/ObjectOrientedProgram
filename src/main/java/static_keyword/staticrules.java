package static_keyword;

public class staticrules {
    int nonstatic;
    static String statica;// this is static variable


    public static void main(String[] args) {
        int a = 10; //in static main it's not static a variable. a is a local variable
        // System.out.println(nonstatic); // nonstatic not allow in static
        System.out.println(statica); // static variable allow in static

    }
}
