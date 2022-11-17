//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not
import java.util.Scanner;
public class ne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many class held till now?");
        int num = sc.nextInt();
        System.out.println("How many class did you attended?");
        int num1 =sc.nextInt();
        int per;
        per = (num1/num)*100;
        if (per < 75 ){
            System.out.println("Go to the Class again");
        } else {
            System.out.println(" Welcome,You had been allowed to seat in exam");
        }


    }
}

