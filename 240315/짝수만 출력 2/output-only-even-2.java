import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();

        int i = 50;

        while(i>=a) {
            if((i%2==0) && (i<=b)) {
                System.out.print(i + " ");
            }

            i--;
        }
        
    }
}