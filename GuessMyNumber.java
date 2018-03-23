import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int guess = in.nextInt();
        System.out.printf("Your guess is %d\n", guess);
        
        // generate random number between 1 and 100 (inclusive)
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("The number I was thinking is %d\n", number);
        
        // difference
        int diff = guess - number;
        diff = Math.abs(diff);
        System.out.printf("You were off by %d\n", diff);
    }
}