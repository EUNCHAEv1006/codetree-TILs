import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10]; // 10부터 100까지의 십의 자리 숫자 빈도수를 저장할 배열

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break; // 0이 입력되면 반복 종료
            if (num >= 10) { // 10점 이상 점수만 처리
                int tens = num / 10; // 십의 자리 숫자 추출
                if (tens > 10) tens = 10; // 100점은 index 9에 저장
                count[tens - 1]++; // 십의 자리가 1인 경우 index 0에 저장
            }
        }

        // 결과 출력
        for (int i = 10; i >= 1; i--) {
            int scoreRange = i * 10;
            System.out.println(scoreRange + " - " + count[i - 1]);
        }

        scanner.close();
    }
}