import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int num = scanner.nextInt();

            if(num==1){
                System.out.println("John");
            } else if(num==2){
                System.out.println("Tom");
            } else if(num==3){
                System.out.println("Paul");
            } else if(num==4){
                System.out.println("Sam");
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}