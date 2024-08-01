import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        // 첫 번째와 두 번째 항 초기화
        list.add(1);
        list.add(n);

        // 100을 넘을 때까지 계속 항을 추가
        while (true) {
            int nextValue = list.get(list.size() - 1) + list.get(list.size() - 2);
            list.add(nextValue);
            if (nextValue > 100) {
                break;
            }
        }

        // 결과 출력
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}