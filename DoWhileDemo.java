import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            } else {
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        }
        double x = in.nextDouble();
        System.out.println(x);
    }
}