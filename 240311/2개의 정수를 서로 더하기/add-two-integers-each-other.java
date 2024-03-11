import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 1 3

        // 4 1
        a += b;

        b += a;

        System.out.println(a + " " + b);
    }
}