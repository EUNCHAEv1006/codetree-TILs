import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double answer = a + 1.5;

        System.out.printf("%.2f", answer);
    }
}