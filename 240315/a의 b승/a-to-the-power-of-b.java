import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = a;

        for(int i=a; i<=b; i++) {
            answer *= a;
        }

        System.out.println(answer);
    }
}