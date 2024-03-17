import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=100; i++) {
            sum += i;

            if(sum>=n) {
                System.out.print(i);
                break;
            }
        }
    }
}