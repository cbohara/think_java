public class PrintTable {
    public static void main(String args[]) {
        printTable(2, 3);
    }
    
    public static void printTable(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            printRow(i, cols);
        }
    }
    
    public static void printRow(int i, int cols) {
        for (int j = 1; j <= cols; j++) {
            System.out.printf("%4d", i * j);
        }
        System.out.println();
    }   
}