//ask the user to input two different string and print them in same line//
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first word");
        String name = sc.next();

        System.out.println("Enter second word:");
         String roll = sc.next();
        System.out.println(name + roll);




    }
}
