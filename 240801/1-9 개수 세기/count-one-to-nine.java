import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] count = new int[9]; // 1부터 9까지의 개수를 저장할 배열

        // 입력받은 숫자들을 카운트
        for(int k = 0; k < n; k++){
            int num = scanner.nextInt();
            count[num - 1]++; // 입력된 숫자에 해당하는 인덱스를 증가
        }

        // 1부터 9까지 각각의 숫자가 몇 번 나왔는지 출력
        for(int i = 0; i < 9; i++){
            System.out.println(count[i]);
        }
    }
}