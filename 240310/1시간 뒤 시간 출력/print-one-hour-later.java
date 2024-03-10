import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter(":");

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        System.out.println((hour+1) + ":" + minute);
    }
}