//program to convert decimal to binary
import java.util.Scanner;

public class bitode {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the decimal number:");

        int n = scn.nextInt();

        int num = 0;

        int pow = 1;

        while(n != 0){

            int rem = n % 2;

            num += rem * pow;

            pow *= 10;

            n /= 2;

        }

        System.out.print(num);

    }

}