//print to n numbers
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the numbers upto where you want to print:  n =");
        int n = sc.nextInt();
        int num=0;
        while (num <= n) {
            System.out.println(num);
            num++;
        }
    }
}
