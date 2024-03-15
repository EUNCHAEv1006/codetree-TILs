import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;

        n = sc.nextInt();
        
        // 1부터 n까지의 수 중, 온전수를 찾아 출력합니다.
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                continue;
            if(i % 10 == 5)
                continue;
            if(i % 3 == 0 && i % 9 != 0)
                continue;
            System.out.print(i + " ");
        }
    }
}