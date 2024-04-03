import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }

        for(int k=0; k<n; k++){
            for(int p=0; p<n-k-1; p++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}