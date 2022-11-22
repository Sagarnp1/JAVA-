import java.util.Scanner;

//find the factorial
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits you want to find the factorial:");
        int n = sc.nextInt();
        int fac = 1;
        for ( int i = 1; i <=n ; i++){
            fac = fac * i;
            System.out.println("Factorial is " +i+ ":" +fac);
        }

    }
}
