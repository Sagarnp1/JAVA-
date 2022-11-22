import java.util.Scanner;

public class patte {
    public static void main(String[] args) {
        int rows;



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        rows=sc.nextInt();



        for(int i = 1, k = 0; i <= rows; ++i, k = 0)

        {

            for(int s = 1; s <= rows-i; ++s)

            {

                System.out.print(" ");

            }



            while(k != 2*i-1)

            {

                System.out.print("*");

                ++k;

            }

            System.out.println("");

        }



    }

}




