import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 1;

        while(i<=b) {
            if((i%2 == 0) && (i >= a)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}