//Given 2 numbers a nd b. find a raise the the power of b
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num:");
        int x = sc.nextInt();
        System.out.println("enter the second num:");
        int y = sc.nextInt();
        int ans=1;
        for (int i =1 ; i<=y; i ++){
            ans  =ans * x;
        }
        System.out.println(ans);
    }
}
