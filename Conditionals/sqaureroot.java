import java.util.Scanner;
public class sqaureroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenghth:");
        int num1 = sc.nextInt();
        System.out.println("eneter the breadth:");
        int num2 = sc.nextInt();
        if (num1 == num2 ){
            System.out.println("YES IT IS Sqaure ");

        }
        else {
            System.out.println("it is rectangle");
        }
    }
}
