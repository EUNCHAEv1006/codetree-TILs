import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10]; // 0부터 9까지의 십의 자리 숫자 빈도수를 저장할 배열

        // 입력을 공백을 기준으로 나누어 처리
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break; // 0이 입력되면 반복 종료
            if (num >= 10) { // 두 자리 수인 경우에만 처리
                int tens = num / 10; // 십의 자리 숫자 추출
                count[tens]++;
            }
        }

        // 결과 출력
        for (int i = 1; i < count.length; i++) {
            System.out.println(i + " - " + count[i]);
        }

        scanner.close();
    }
}