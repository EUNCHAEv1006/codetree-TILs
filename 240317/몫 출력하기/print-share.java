import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
	    int cnt = 0;
        
        while(true) {
            // 변수 선언 및 입력
            int n;
            n = sc.nextInt();

            // n이 홀수라면 아무 작업도 하지 않고, n이 짝수라면 n/2를 출력하는 작업을 3번 한 뒤 종료합니다.
            if(n % 2 == 1)
                continue;
            
            System.out.println(n / 2);
            cnt++;
            
            if(cnt >= 3)
                break;
        }
    }
}