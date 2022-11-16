// Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
// calculate Profit or Loss.
import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double Cp = sc.nextDouble();
        System.out.println("Enter the selling Price:");
        double Sp = sc.nextDouble();
        if (Sp > Cp) {
            double profit;
            profit = Sp - Cp;
            System.out.println("Your profit is: " +profit);

        }
        else if ( Sp < Cp) {
            double loss;
            loss = Cp - Sp;
            System.out.println("Your loss is: " +loss);
        }
         else  {
            System.out.println("NO PAIN NO GAIN");



        }

    }
}
