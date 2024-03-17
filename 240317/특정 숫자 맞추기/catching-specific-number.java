import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int num = scanner.nextInt();

            if(num>25){
                System.out.println("Lower");
            } else if(num<25){
                System.out.println("Higher");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}