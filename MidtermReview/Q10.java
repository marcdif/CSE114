import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter the first integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt(); // 12
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();// 16
        int result = Math.min(firstNumber, secondNumber); // 12
        while (firstNumber % result != 0 || secondNumber % result != 0) {
            result--;
        }
        System.out.println("The greatest common divisor is: " + result); // 4
    }
}
