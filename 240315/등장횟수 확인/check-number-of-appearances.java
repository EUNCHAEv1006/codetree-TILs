import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int count=0;

        for(int i=1; i<=5; i++) {
            num = scanner.nextInt();

            if(num%2==0) {
                count++;
            }
        }

        System.out.println(count);
    }
}