//sum of first n natural numbers

import java.util.Scanner;
public class sumf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum,num;
        sum = 0;
        num = 1;
        while(num<=n){
            sum = sum + num;

            num ++;


        }
        System.out.println(sum);

    }
}
