@SuppressWarnings("ALL")
public class Q3 {
    public static void main(String[] args) {
        int x = 10; // 10
        int y = 4;  // 4
        if (x < 5 && ++y == 5) // first expression is false, so we don't evaluate second, and the ++y doesn't get called
            System.out.println("x is : " + x + " and, y is: " + y);
        else
            System.out.println("x is : " + x + " and, y is: " + y);
        /*
        AND: if first expression is false, don't evaluate second
        AND: if first expression is true, do evaluate second
        OR: if first expression is true, don't evaluate second
        OR: if first expression is false, do evaluate second
        XOR: always evaluate both
         */
    }
}