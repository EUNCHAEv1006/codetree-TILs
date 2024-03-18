import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int j=1; j<=n; j++){
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int j=1; j<=n; j++){
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}