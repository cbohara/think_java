import java.util.Random;
import java.util.Arrays;

public class CheckRange {
    public static void main(String args[]) {
        int[] scores = new int[5];
        scores = generateArray(scores);
        System.out.println(Arrays.toString(scores));
    }
    
    public static int[] generateArray(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }
}