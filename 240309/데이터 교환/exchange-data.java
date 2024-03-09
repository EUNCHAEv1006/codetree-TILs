public class Main {
    public static void main(String[] args) {
        
        // 5 6 7 .
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        
        // . 6 7 5
        temp = a;

        // 7 6 . 5
        a = c;

        // 7 . 6 5
        c = b;

        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}