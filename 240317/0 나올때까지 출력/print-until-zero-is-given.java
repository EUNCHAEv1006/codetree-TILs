import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            int num = scanner.nextInt();

            if(num==0) {
                break;
            }

            System.out.println(num);
        }
    }
}