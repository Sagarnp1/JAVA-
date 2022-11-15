// and or logical expression
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the !st value");
        int a = sc.nextInt();
        System.out.println("eneter the 2nd  value");
        int b = sc.nextInt();
        System.out.println(a < 50 && a < b);
        System.out.println(a < 50 || a <b);




    }
}