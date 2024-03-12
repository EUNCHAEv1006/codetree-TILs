import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if( (n%2 !=0 || n%3==0) || (n%2==0 || n%5==0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}