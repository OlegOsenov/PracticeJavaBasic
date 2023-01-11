package easyCodeRuPractice.lesson23;

public class DaysForMonth {
    public static void main(String[] args) {
        print(getDaysForMonth("JANUARY"));
        print(getDaysForMonth("january"));
        print(getDaysForMonth("февраль"));


    }

    private static String getDaysForMonth(String month) {
        int days;
        switch (month.toLowerCase()) {
            case "january":
            case "январь":
                days = 31;
                break;
            case "february":
            case "февраль":
                days = 28;
                break;
            default:
                days = 0;
        }
        return month + " has " + days + " days.";
    }

    private static void print(int str) {
        System.out.println(str);
    }
    private static void print(String str) {
        System.out.println(str);
    }
}
