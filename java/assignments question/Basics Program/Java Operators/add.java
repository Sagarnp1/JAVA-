// Write a program to add 8 to the number x and then divide it by 3. Now, the modulus
// of the quotient  is taken with 5 and then multiply the resultant value by 5. Display the final result.
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        x+=8;
        System.out.println(x); //13
        x = x/3;  //divide
        System.out.println(x);
        x = x%5;  // remainder
        System.out.println(x);
        x = x *5;  // multiplication
        System.out.println(x);

    }
}
