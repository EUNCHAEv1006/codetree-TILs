import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 28일 -> 2
        // 30일 -> 4, 6, 9, 11
        // 31일 -> 1, 3, 5, 7, 8, 10, 12

        if (n==2) {
            System.out.println("28");
        } else if(n==4 || n==6 || n==9 || n==11) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}