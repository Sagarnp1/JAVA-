//swap two variables without suing third variables
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt(); //initializing the values
        System.out.println("before swapping:" +a+ "" +b);
        //after swapping
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: " +a +"  " + b);


    }
}
