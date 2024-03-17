import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i=1; i<=a; i++) {
            if((i%2==0) && (i%4!=0)) {
                continue;
            }

            if((i/8)%2==0) {
                continue;
            }

            if(i%7<4) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}