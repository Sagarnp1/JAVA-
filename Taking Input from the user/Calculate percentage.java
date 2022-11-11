//If the marks of Robert in three subjects are entered through keyboard (each out of
//100), write a program to calculate his total marks and percentage marks//
import java.util.Scanner;
public class input {
    public static void main(String[] args) {

        float percentage;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of science:");
        int name = sc.nextInt();

        System.out.println("Enter the marks of English:");
         int roll = sc.nextInt();
        System.out.println("Enter the marks of Computer:");
        int com = sc.nextInt();
        int totalMarks = name + roll + com;
        System.out.println("Total Marks is: " + totalMarks);

        int per = (totalMarks * 100 / 300);
        System.out.println("PErcentage:" + per);








    }
}
