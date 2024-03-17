import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for(int i=1; ; i++) {
            n = n/i;
            count++;

            if(n<=1) {
                System.out.println(count);
                break;
            }
        }
    }
}