import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int area = (width+8) * (height*3);

        System.out.println(width+8);
        System.out.println(height*3);
        System.out.println(area);
    }
}