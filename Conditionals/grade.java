//Write a program to calculate marks to grades
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Obtained Marks:");
        int num = sc.nextInt();
        if (num >= 90){
            System.out.println("You obtained the grades:  A+");
        } else if (num<90 && num>=80) {
            System.out.println("You Obtained the grades: A");

        } else if (num<80 || num>=70) {
            System.out.println("You Obtained the grades:  B+");

        } else if (num<70 || num>=60) {
            System.out.println("You Obtained the grades:  B");

        } else if (num<60 && num>=50) {
            System.out.println("You Obtained the grades:  C");


        }
        else {
            System.out.println("Failed : Read Hard");
        }
    }
}
