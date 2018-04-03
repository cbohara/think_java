import java.util.Arrays;

public class PrintArray {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        printArray(a);
        //built-in alternative to printArray
        System.out.println(Arrays.toString(a));
    }
    
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
}