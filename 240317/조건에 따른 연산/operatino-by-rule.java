import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while(true){
            if(n%2==0){
                n = (n*3)+1;
                count++;
            } else{
                n = (n*2)+2;
                count++;
            }

            if(n>=1000){
                System.out.println(count);
                break;
            }
        }
    }
}