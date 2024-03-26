import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int k=0; k<n; k++){
            for(int l=0; l<n-k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}