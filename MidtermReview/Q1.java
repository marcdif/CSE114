public class Q1 {
    public static void main(String[] args) {
        int a = 6;   // 6, 7
        int b = a++; // 6
        System.out.println(a);
        System.out.println(b);
        a = 6;  // 6, 7
        b = ++a;// 7
        System.out.println(a);
        System.out.println(b);
    }
}