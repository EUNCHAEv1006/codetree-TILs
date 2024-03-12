import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coldA = scanner.next().toString();
        int tempA = scanner.nextInt();

        String coldB = scanner.next().toString();
        int tempB = scanner.nextInt();

        String coldC = scanner.next().toString();
        int tempC = scanner.nextInt();

        String result;

        if(coldA.equals("Y") && (tempA >= 37)) {
            if((coldB.equals("Y") && (tempB >= 37)) || (coldC.equals("Y")) && (tempC >= 37)) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
        }

        if(coldA.equals("N") && (tempA >= 37)) {
            if((coldB.equals("N") && (tempB >= 37)) || coldC.equals("N") && (tempC >= 37)) {
                System.out.println("N");
            }else {
                System.out.println("N");
            }
        }

        if(coldA.equals("Y") && (tempA < 37)) {
            if((coldB.equals("Y") && (tempB < 37)) || coldC.equals("Y") && (tempC < 37)) {
                System.out.println("N");
            }else {
                System.out.println("N");
            }
        }

    }
}