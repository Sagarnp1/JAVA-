//program to convert binary to decimal
import java.util.Scanner;

public class detobi {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("ENter the binary num:");

        int n = scn.nextInt();

        int num = 0;

        int pow = 1;

        while(n != 0){

            int rem = n % 2;

            num += rem * pow;

            pow *= 2;

            n /= 10;

        }

        System.out.print(num);

    }

}
