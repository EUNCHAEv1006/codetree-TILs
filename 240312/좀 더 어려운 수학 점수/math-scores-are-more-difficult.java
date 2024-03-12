import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mathA = sc.nextInt();
        int EnglishA = sc.nextInt();

        int mathB = sc.nextInt();
        int EnglishB = sc.nextInt();

        // Case 1.
        if(mathA == mathB){
            if(EnglishA>EnglishB){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
        // Case 2.
        else if(mathA>mathB){
            System.out.println("A");
        }
        // Case 3.
        else {
            System.out.println("B");
        }

    }

}