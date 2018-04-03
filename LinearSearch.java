public class LinearSearch {
    public static void main(String args[]) {
        double[] a = {1, 2, 3, 4, 5};
        int index = search(a, 4);
        System.out.println(index);
    }
    
    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}