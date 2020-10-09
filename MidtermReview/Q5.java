@SuppressWarnings("ALL")
public class Q5 {
    public static void main(String[] args) {
        boolean x = 1 + 4 * 4 < 5 * (4 - 3) - 1 && 4 - 3 < 5;
        // PEMDAS   1 + 4 * 4 < 5 * (4 - 3) - 1 && 4 - 3 < 5
        // (^*/+-   1 + 4 * 4 < 5 * 1 - 1 && 4 - 3 < 5
        //          1 + 16 < 5 - 1 && 4 - 3 < 5
        //          17 < 5 - 1 && 4 - 3 < 5
        //          17 < 4 && 1 < 5
        //          false && true = false
        System.out.println(x); // false
    }
}