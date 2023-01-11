package easyCodeRuPractice.lesson23;

public class DaysForMonth {
    public static void main(String[] args) {
        print(getDaysForMonth("JANUARY"));
        print(getDaysForMonth("january"));
        print(getDaysForMonth("февраль"));


    }

    private static int getDaysForMonth(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "январь":
                return 31;
            case "february":
            case "февраль":
                return 28;
            default:
                throw new IllegalArgumentException("not recognized month " + month);
        }
    }

    private static void print(int str) {
        System.out.println(str);
    }
}
