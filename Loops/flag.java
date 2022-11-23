//Nepal's flag Using Loop (JAVA)
import java.util.Scanner;

public class flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print Valid upto 30 :");
        int r = sc.nextInt();
        for (int i =1; i<=r; i+=2) {
            for (int j = 1; j <=i; j++) {



                    System.out.print("*");
                }
                System.out.println();

            }
        for(int k=3; k<=60; k+=4) {


            for (int l = 1; l <= k; l ++) {
                System.out.printf("*");
            }
            System.out.println();


            }
        }



}
