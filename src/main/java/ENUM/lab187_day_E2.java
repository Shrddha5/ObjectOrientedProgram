package ENUM;

public class lab187_day_E2 {
    public class Lab198_ENUM_P2 {
        public void main(String[] args) {

            lab185_day.Day today = lab185_day.Day.MONDAY;

            switch (today) {
                case MONDAY -> System.out.println("Monday");
                case FRIDAY -> System.out.println("FRIDAY");
            }


            System.out.println(API_URLS.valueOf("google"));
        } // google take from API_URLS enum class
    }
}