import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while(true){
            int age = scanner.nextInt();

            if(!((age>=20) && (age<=29))) {
                System.out.printf("%.2f", sum/count);
                break;
            }

            sum += age;
            count++;
        }
    }
}