import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean satisfied = false;

        for(int i=a; i<=b; i++){
            if((1920%i==0) && (2880%i==0)){
                satisfied = true;
                break;
            }
        }

        if(satisfied){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}