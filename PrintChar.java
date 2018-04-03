public class PrintChar {
    public static void main(String args[]) {
        String fruit = "banana";
        printChar1(fruit);
        printChar2(fruit);
    }
    
    public static void printChar1(String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
        }
    }
    
    public static void printChar2(String word) {
        for (char letter : word.toCharArray()) {
            System.out.println(letter);
        }
    }
}