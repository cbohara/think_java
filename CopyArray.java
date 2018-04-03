import java.util.Arrays;

public class CopyArray {
    public static void main(String args[]) {
        int[] a = {1, 2, 3};
        
        int[] manual = new int[3];
        manual = manualCopy(a);
        printArray(manual);
        
        int[] auto = new int[3];
        auto = builtInCopy(a);
        printArray(auto);
    }
    
    public static int[] manualCopy(int[] a) {
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    
    public static int[] builtInCopy(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);
        return b;
    }
    
    public static void printArray(int [] array) {
        System.out.println(Arrays.toString(array));
    }
}