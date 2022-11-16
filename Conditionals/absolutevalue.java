//  to print the absolute value of any number
import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter any number");
        int num = sc.nextInt();
        if (num < 0) {
            num = num * -1;

        }
        System.out.println("Tne absolute value is :  " + num);
    }
}
