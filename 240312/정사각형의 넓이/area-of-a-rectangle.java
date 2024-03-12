import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int area = n * n;

        System.out.println(area);

        if (n < 5) {
            System.out.println("tiny");
        }
    }
}