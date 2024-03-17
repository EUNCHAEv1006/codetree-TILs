import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            String mz = scanner.next();
            int area = width * height;

            if(mz.equals("C")) {
                System.out.println(area);
                break;
            }

            System.out.println(area);
        }
    }
}