import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (a > c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (a > d) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (a > e) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}