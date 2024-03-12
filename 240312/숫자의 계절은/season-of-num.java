import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        if (5 >= month && month >= 3) {
            System.out.println("Spring");
        } else if (8 >= month && month >= 6) {
            System.out.println("Summer");
        } else if (11 >= month && month >= 9) {
            System.out.println("Fall");
        } else if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        }
    }
}