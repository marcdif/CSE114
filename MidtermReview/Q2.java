public class Q2 {
    public static void main(String[] args) {
        double x = 1.0; // 1.0, 0
        double y = 5.0; // 5.0, 6
        double z = x-- + (++y); // 1 + 6 = 7
        System.out.println(x); // 1
        System.out.println(y); // 6
        System.out.println(z); // 7
    }
}