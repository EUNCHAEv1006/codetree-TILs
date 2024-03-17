import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];

        for(int i=0; i<5; i++){
            num[i] = scanner.nextInt();
        }

        if((num[0]%3==0) && (num[1]%3==0) && (num[2]%3==0) && (num[3]%3==0) && (num[4]%3==0)) {
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}