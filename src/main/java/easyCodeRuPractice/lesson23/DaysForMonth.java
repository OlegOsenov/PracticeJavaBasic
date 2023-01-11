package easyCodeRuPractice.lesson23;

public class DaysForMonth {
    public static void main(String[] args) {
        print(getDaysForMonth("JANUARY"));
        print(getDaysForMonth("january"));


    }

    private static int getDaysForMonth(String month){
        switch (month.toLowerCase()){
            case "january" : return  31;
            case "february" : return  28;
            default : throw new IllegalArgumentException("not recognized month " + month);
        }
    }

    private static void print(int str){
        System.out.println(str);
    }
}
