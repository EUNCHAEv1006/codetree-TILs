import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 출력
        // a와 b를 비교한뒤, a가 b보다 크다면 a와 c를 비교하여 최댓값을 구합니다.
        if(a >= b) {
            if(a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        }

        // a와 b를 비교한 결과가 나와있으므로, b와 c만 비교하여 최댓값을 구합니다.
        else {
            if(b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}