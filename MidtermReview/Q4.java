@SuppressWarnings("ALL")
public class Q4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        if (x < 5 || ++y == 5) // first expression is false, second expression is true, so we evaluate ++y and go to line 7
            System.out.println("x is : " + x + " and, y is: " + y);
        else
            System.out.println("x is : " + x + " and, y is: " + y);
    }
}