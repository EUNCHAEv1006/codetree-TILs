import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // b 가 중간 a > b > c, c > b > a
        if((a > b) && (b > c)) {
            System.out.println(b);
        } else if((c > b) && (b > a)) {
            System.out.println(b);
        }

        // a가 중간 b > a > c , c > a > b
        if((b > a) && (a > c)) {
            System.out.println(a);
        } else if((c > a) && (a > b)) {
            System.out.println(a);
        }

        //c가 중간 a > c > b, b > c > a
        if((a > c) && (c > b)) {
            System.out.println(c);
        } else if((b > c) && (c > a)) {
            System.out.println(c);
        }
    }
}