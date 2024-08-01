import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for(int i=1; i<=10; i++) {
            if((i*n)%5==0){
                count++;
            }

            System.out.print((i*n) + " ");
            
            if(count==2){
                break;
            }
        }
    }
}