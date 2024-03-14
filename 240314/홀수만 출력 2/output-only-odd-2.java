import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();

        for(int i=b; i>=a; i-=2) {
            System.out.print(i + " ");
        }
    }
}