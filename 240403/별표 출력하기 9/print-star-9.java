import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 모양에 맞게 별을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = n - i; j > 1; j--)
                System.out.print("  ");
            for(int j = 0; j < 2 * i + 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}