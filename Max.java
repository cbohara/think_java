import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        // wrapper class for int is Integer 
        int max = Integer.MIN_VALUE;
        // for each input provided via command line
        for (String arg : args) {
            // convert input arg string to an integer
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);
    }
}