import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
	    int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean satisfied = false;

        for(int i = a; i <= b; i++) {
            // a에서 b사이의 값 중 c의 배수가 있는지 확인합니다.
            if(i % c == 0)
                satisfied = true;
        }

        //출력
	    if(satisfied == true)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}