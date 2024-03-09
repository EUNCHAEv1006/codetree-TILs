public class Main {
    public static void main(String[] args) {
        int chu = 13;
        double moon = 0.165;

        double answer = chu * moon;

        System.out.print(chu + " * ");

        System.out.printf("%.6f", moon);

        System.out.printf(" = ");

        System.out.printf("%.6f", answer);
    }
}