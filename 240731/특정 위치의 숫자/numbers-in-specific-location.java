import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0;

        for(int i=0; i<10; i++){
            arr[i] = scanner.nextInt();

            if(i==2 || i==4 || i==9){
                sum += arr[i];
            }
        }

        System.out.print(sum);
    }
}