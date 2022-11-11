//ask the user to input name, rollno, phone no, field of interest//
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Your name is :" + name);
        System.out.println("Enter your roll no:");
         int roll = sc.nextInt();
        System.out.println("your roll no is " + roll);
        System.out.println("enter your field of interest");
        String field = sc.next();
        System.out.println("Your field of interest is  " +field);
        System.out.println("enter your phone number:");
        int phone = sc.nextInt();
        System.out.println("Your phone number is:" + phone);



    }
}
