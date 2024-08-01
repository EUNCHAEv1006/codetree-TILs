import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int oneSum = 0;
        int twoSum = 0;
        int threeSum = 0;
        int fourSum = 0;
        int fiveSum = 0;
        int sixSum = 0;

        for(int i=0; i<10; i++){
            arr[i] = scanner.nextInt();

            switch(arr[i]) {
                case 1: oneSum++; break;
                case 2: twoSum++; break;
                case 3: threeSum++; break;
                case 4: fourSum++; break;
                case 5: fiveSum++; break;
                default: sixSum++;
            }
        }

        System.out.println("1 - " + oneSum);
            System.out.println("2 - " + twoSum);
            System.out.println("3 - " + threeSum);
            System.out.println("4 - " + fourSum);
            System.out.println("5 - " + fiveSum);
            System.out.println("6 - " + sixSum);

        // for(int i=1; i<=6; i++) {
        //     System.out.println("1 - " + oneSum);
        //     System.out.println("2 - " + twoSum);
        //     System.out.println("3 - " + threeSum);
        //     System.out.println("4 - " + fourSum);
        //     System.out.println("5 - " + fiveSum);
        //     System.out.println("6 - " + sixSum);
        // }
    }
}