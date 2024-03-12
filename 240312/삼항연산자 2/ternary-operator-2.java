import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String result = (a == 1) ? "t" : "f";

        System.out.println(result);
    }
}