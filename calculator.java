//make the calculator using java
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        char num;
        double num1;
        double num2;
        double ans;
        System.out.println("Enter any operator:");
        num = sc.next().charAt(0);
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        num2 = sc.nextDouble();
        switch (num) {
            case '+':
                ans = num1 + num2;
                System.out.println(num1+  "+"   +num2 + "="  +ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1+  "-"   +num2 + "="  +ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1+  "*"   +num2 + "="  +ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(num1+  "/"   +num2 + "="  +ans);
                break;
            case '%':
                ans = num1 % num2;
                System.out.println(num1+  "%"   +num2 + "="  +ans);
                break;
            default:
                System.out.println("You entred invalid Operator, Motherfucker");
                break;
        }
    }
}
