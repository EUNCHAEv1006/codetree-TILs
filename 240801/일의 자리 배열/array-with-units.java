import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[10];

        arr[0] = n;
        arr[1] = m;

        for(int i=2; i<10; i++){
            arr[i] = (arr[i-1] + arr[i-2])%10;
        }

        for(int i=0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}