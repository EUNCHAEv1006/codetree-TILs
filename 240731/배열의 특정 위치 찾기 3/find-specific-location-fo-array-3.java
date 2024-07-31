import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 100;
        int arr[] = new int[100];
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();

            if(arr[i] == 0) {
                sum += arr[i-1] + arr[i-2] + arr[i-3];
                break;
            }
        }
        System.out.println(sum);
    }
}