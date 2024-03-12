import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ageA = sc.nextInt();
        String sexA = sc.next();

        int ageB = sc.nextInt();
        String sexB = sc.next();

        if((ageA >= 19 && ageB >= 19) || (sexA.equals('M') && sexB.equals('M'))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}