import java.util.Scanner;

//count the number of digits for a given number n
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();
        int num = 0;
        int org = n;

        while (n>0){
           n =  n / 10;
            num++;

        }
        System.out.println(num);
    }

}
