public class ReverseString {
    public static void main(String args[]) {
        String fruit = "banana";
        String reversed = reverse(fruit);
        System.out.println(reversed);
    }
    
    public static String reverse(String s) {
        String r = "";
        for (char letter : s.toCharArray()) {
            r = letter + r;
        }
        return r;
    }
}