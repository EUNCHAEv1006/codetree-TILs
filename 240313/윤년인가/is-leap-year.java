import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        if(y%4 == 0) {
            System.out.println("true");
        } else if((y%100 ==0) && (y%400 != 0)) {
            System.out.println("false");
        } else {
            System.out.println("false");
        }
    }
}