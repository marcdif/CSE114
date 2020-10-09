import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter an integer: 1, 2, 3 or 4");
        int x = stdin.nextInt();
        if (x == 1)
            System.out.println("Freshman");
        else if (x == 2)
            System.out.println("Sophomore");
        else if (x == 3)
            System.out.println("Junior");
        else if (x == 4)
            System.out.println("Senior");
        else
            System.out.println("Improper input");
        stdin.close();
    }
}