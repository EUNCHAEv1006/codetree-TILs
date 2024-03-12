import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int middle = scanner.nextInt();
        int finalE = scanner.nextInt();

        if(middle >= 90) {
            if(finalE >= 95) {
                System.out.println("100000");
            } else if(finalE >= 90) {
                System.out.println("50000");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}