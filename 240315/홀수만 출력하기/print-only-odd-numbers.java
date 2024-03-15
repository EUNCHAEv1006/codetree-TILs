import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num;

        for(int i=1; i<=n; i++) {
            num = scanner.nextInt();
            if((num%2 == 1) && (num%3==0)) {
                System.out.println(num);
            }
        }
    }
}