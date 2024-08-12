import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cold = new String[3];
        int[] temp = new int[3];

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for(int i=0; i<3; i++){
            cold[i] = scanner.next();
            temp[i] = scanner.nextInt();

            if(cold[i].equals("Y") && temp[i] >=37){
                aCount++;
            } else if(cold[i].equals("N") && temp[i] >=37){
                bCount++;
            } else if(cold[i].equals("Y") && temp[i] < 37) {
                cCount++;
            } else {
                dCount++;
            }
        }

        System.out.print(aCount + " " + bCount  + " " + cCount + " " + dCount + " ");

            if(aCount >= 2){
                System.out.print("E");
            }
    }
}