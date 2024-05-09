import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i=2; i <= 8; i+=2) {
            System.out.print(b + " * " + i + " = " + b*i + " / ");
            System.out.print(b-1 + " * " + i + " = " + (b-1)*i + " / ");
            System.out.print(b-2 + " * " + i + " = " + (b-2)*i);
            System.out.println();
        }
    }
}