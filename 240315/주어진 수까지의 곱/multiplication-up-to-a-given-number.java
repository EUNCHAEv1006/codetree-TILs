import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = 1;

        for(int i=a; i<=b; i++) {
            prod *= i;
        }

        System.out.println(prod);
    }
}