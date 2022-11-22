import java.util.Scanner;

//printing the patern *
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows you want to print:");
        int r = sc.nextInt();
        System.out.println("Enter the number of Columns you want to print:");
        int c = sc.nextInt();
        for(int i = 1; i<=r; i++){
            for(int j =1; j<=c; j++){
                if (i==1|| i==r || j==1 || j==c)
                    System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
