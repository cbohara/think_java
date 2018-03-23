import java.util.Scanner;

public class CheckInt {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        scanInt(in);
    }
    
    public static void scanInt(Scanner in) {
        System.out.print("Enter a number: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.printf("%s is not a number\n", word);
            return;
        }
        int x = in.nextInt();
        printLogarithm(x);
    }
    
    public static void printLogarithm(int x) {
        if (x <= 0) {
            System.err.println("Error: x must be positive");
            return;
        }
        double result = Math.log(x);
        System.out.printf("The log of %d is %.3f\n", x, result);
    }
}