import java.util.Scanner;
public class addnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any  number:");

        int a = sc.nextInt();
        System.out.println("eneter Second num:");

        int b = sc.nextInt();
        System.out.println("eneter third num:");
        int c = sc.nextInt();
        int z;
        z = a + b + c;


        System.out.println(z);

    }
}
