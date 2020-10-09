import java.util.Scanner;

@SuppressWarnings("ALL")
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: "); // Welcome to C++
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: "); // Welcome to programming
        String secondString = scanner.nextLine();

        int length = Math.min(firstString.length(), secondString.length());
        String result = "";

        for (int i = 0; i < length; i++) {
            char firstChar = firstString.charAt(i);
            char secondChar = secondString.charAt(i);

            if (firstChar == secondChar) {
                result += firstChar;
            } else {
                break;
            }
        }

        if (result.isEmpty()) {
            System.out.println("There is no common prefix!");
        } else {
            System.out.println("The common prefix is: " + result); // Welcome to
        }
    }
}
