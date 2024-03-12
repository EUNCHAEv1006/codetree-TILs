import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        
        if (a%3 ==0 || a%5 ==0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}