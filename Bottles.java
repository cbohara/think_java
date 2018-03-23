public class Bottles {
    public static void main(String[] args) {
        bottlesOfBeer(2);
    }
    public static void bottlesOfBeer(int x) {
        if (x == 0) {
            finalVerse();
        } else {
            verseStart(x);
            x = x - 1;
            verseEnd(x);
            bottlesOfBeer(x);
        }
    }
    
    public static void verseStart(int x) {
        System.out.printf("%d bottles of beer on the wall,\n", x);
        System.out.printf("%d bottles of beer,\n", x);
        System.out.println("ya’ take one down, ya’ pass it around,"); 
    }
    
    public static void verseEnd(int x) {
        System.out.printf("%d bottles of beer on the wall.\n", x);
    }
    
    public static void finalVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there are no more bottles of beer on the wall!");
    }
}