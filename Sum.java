public class Sum {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int output = sum(a);
        System.out.println(output);
    }
    
    public static int sum(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
}