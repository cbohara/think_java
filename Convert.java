import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        // all variables and constants declared at top of main for readability 
        double cm;
        int feet, inches, remainder;
        // declaring a variable as final means that it cannot be reassigned once it has been initialized
        // variables declared as final = constants 
        // by convention constant variables are all upper case with underscores
        final double CM_PER_INCH = 2.54;
        final int INCH_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);
        
        // reads input from keyboard and converts to double
        System.out.print("Exactly how many cm? ");
        cm = in.nextDouble();
        
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / INCH_PER_FOOT;
        remainder = inches % INCH_PER_FOOT;
        System.out.printf("%.2f cm ~= %d feet %d inches\n", cm, feet, remainder);
    }
}