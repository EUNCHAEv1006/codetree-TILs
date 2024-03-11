import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int multiple = a * b;
        int divide = a / b;

        System.out.println(a + " * " + b + " = " + multiple);
        System.out.println(a + " / " + b + " = " + divide);
    }
}