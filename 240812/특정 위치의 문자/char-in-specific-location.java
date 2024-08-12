import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char a = scanner.next().charAt(0);

        int idx = -1;

        for(int i=0; i<arr.length; i++){
            
            if(arr[i] == a){
                idx = i;
            }
        }

        if(idx==-1){
            System.out.print("None");
        } else {
            System.out.print(idx);
        }
    }
}