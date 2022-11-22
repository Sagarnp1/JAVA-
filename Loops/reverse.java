import java.util.Scanner;

//reverse of a number
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits you want to reverse:");


        int n = sc.nextInt();

        int rev =0;
        while(n>0) {
            rev = rev * 10 + n % 10;
            n/=10;

        }
        System.out.println(rev);
    }
}
