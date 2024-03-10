import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("-");

        int zero = scanner.nextInt();
        int front = scanner.nextInt();
        int back = scanner.nextInt();

        System.out.print("0" + zero + "-" + back + "-" + front);
    }
}