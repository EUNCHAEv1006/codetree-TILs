import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int total = a+b+c;

        System.out.println(total);
        System.out.println(total/3);
        System.out.println(total - (total/3));
    }
}