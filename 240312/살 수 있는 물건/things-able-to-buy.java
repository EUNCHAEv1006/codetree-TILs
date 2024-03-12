import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 3000) {
            System.out.println("book");
        } else if (n < 3000 && n >= 1000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}