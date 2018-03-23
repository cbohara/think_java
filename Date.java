public class Date {
    
    public static void printAmerican(int year, String month, int date, String day) {
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(int year, String month, int date, String day) {
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args) {
        String month, day;
        int year, date;
        year = 2018;
        month = "March";
        date = 22;
        day = "Thursday";

        printAmerican(year, month, date, day);
        printEuropean(year, month, date, day);
    }
}