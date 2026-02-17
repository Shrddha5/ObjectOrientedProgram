package ENUM;

public class lab186_day_Enum
{
    public static void main(String[] args) {
        lab185_day.Day today = lab185_day.Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal()); // (zero-indexed position) i.e.monday in lab185
    }



}
