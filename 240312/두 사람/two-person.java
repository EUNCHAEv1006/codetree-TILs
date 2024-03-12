import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int a_year = sc.nextInt();
String a_sex = sc.next().toString(); 

int b_year  = sc.nextInt();
String b_sex = sc.next().toString(); 

if( (a_year >=19 && a_sex.equals("M")) || (b_year >=19 && b_sex.equals("M"))) {
    System.out.println(1);
}else {
    System.out.println(0);
}
    }
}