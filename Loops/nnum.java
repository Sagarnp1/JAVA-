import java.util.Scanner;

//sum of digits in a given number n
public class nnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int n = sc.nextInt();
        int sum = 0;
        int org = n;
        while (n>0){
            sum +=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
