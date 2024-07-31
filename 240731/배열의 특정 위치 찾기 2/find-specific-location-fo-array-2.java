import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<10; i++){
            arr[i] = scanner.nextInt();

            if(i%2==0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        if(evenSum > oddSum){
            System.out.print(evenSum - oddSum);
        } else {
            System.out.print(oddSum - evenSum);
        }
    }
}