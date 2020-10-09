import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("input an integer in the range 1 to 4");
        Scanner stdin = new Scanner(System.in);
        int intInput = stdin.nextInt();
        switch (intInput) {
            case 1:
                System.out.println("you entered ONE");
                break;
            case 2:
                System.out.println("you entered TWO");
            case 3:
                System.out.println("you entered THREE");
                break;
            default:
                System.out.println("your input out of range");
        }
        stdin.close();
    }
}
