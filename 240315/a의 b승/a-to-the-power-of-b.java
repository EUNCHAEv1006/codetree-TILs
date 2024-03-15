import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int a, b;
        int prod = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        // a를 b번 곱합니다.
        for(int i = 1; i <= b; i++) {
            prod *= a;
        }

        // 출력
        System.out.print(prod);
    }
}