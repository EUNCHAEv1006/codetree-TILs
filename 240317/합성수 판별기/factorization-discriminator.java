import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
	    int n;
        n = sc.nextInt();
        boolean satisfied = false;

        for(int i = 2; i < n; i++) {
            // n의 약수가 있다면 합성수입니다.
            if(n % i == 0)
                satisfied = true;
        }

        //출력
        if(satisfied == true)
            System.out.println("C");
        else
            System.out.println("N");
    }
}