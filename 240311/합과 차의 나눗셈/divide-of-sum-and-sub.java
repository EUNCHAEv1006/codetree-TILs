import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double answer = (a+b)/(a-b); 

        System.out.printf("%.2f", answer);
    }
}