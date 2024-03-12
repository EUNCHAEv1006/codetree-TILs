import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sex = scanner.nextInt();
        int age = scanner.nextInt();

        // 남자
        if (sex == 0) {
            if(age >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        }

        if (sex == 1) {
            if(age >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}