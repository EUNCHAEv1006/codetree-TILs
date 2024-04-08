import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<1+(i/2); j++){
                    System.out.print("* ");
                }
            } else {
                for(int j=0; j<n-(i-1)/2; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i=n; i>0; i--){
            if(i%2==0){
                for(int j=n-(i-1)/2; j>0; j--){
                    System.out.print("* ");
                }
            } else {
                for(int j=1+(i/2); j>0; j--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}