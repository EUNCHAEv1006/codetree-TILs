import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a += 87;
        b %= 10;

        System.out.println(a);
        System.out.println(b);
    }
}