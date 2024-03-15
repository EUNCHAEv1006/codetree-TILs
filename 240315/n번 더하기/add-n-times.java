import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;

        for(int i=a; ; i+=n) {
            System.out.println(i+n);
            count++;

            if(count == n) {
                break;
            }
        }
    }
}