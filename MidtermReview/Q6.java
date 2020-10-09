public class Q6 {
    public static void main(String[] args) {
        int sum = 0; // 0, 17, 35, 54
        int j = 17;  // 17, 18, 19, 20
        while (j % 10 != 0) {
            sum += j;
            j++;
        }
        System.out.println("j:-->" + j + ", sum:" + sum); // sum = 54, j = 20
    }
}