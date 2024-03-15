import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(!((i%2==0) || (i%3==0) || (i%5==0))) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}