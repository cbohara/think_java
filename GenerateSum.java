import java.util.Scanner;

public class GenerateSum {
    public static void main(String args[]) {
        int sum = maxSum(50);
        System.out.println(sum);
    }
    
    public static int maxSum(int n) {
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while (sum < 50) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            System.out.println("Adding " + x);
            sum += x;
        }
        return sum;
    }
}