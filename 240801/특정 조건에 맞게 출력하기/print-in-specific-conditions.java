import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int i = 0;

        while(scanner.hasNext()){
            arr[i] = scanner.nextInt();

            if(arr[i]==0){
                break;
            }

            if(arr[i]%2==0){
                System.out.print(arr[i]/2+ " ");
            } else {
                System.out.print(arr[i]+3 + " ");
            }
            
            i++;
        }
    }
}