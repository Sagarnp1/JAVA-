// a program to print a triangle of prime numbers upto given number of lines of the triangle
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x;
        int y;
        int z;
        int num=3;
        int ban=0;
        System.out.printf("Enter the number of lines:");
        x = scn.nextInt();
        int c= x;
        for(y=1;y<= x; y++){
            for(int f=1;f<=c;f++){
                System.out.print(" ");
            }
            if(y==1){
                System.out.print("2");
            }
            else{//other lines
                for(z=0; z!= y;){
                    ban=0;
                    for (int k=2;k<num;k++){
                        if((num%k)==0)
                            ban=1;
                    }
                    if(ban==0){ //prime
                        z++;
                        System.out.print(num);
                    }
                    num++;
                }
            }
            System.out.println();
            c--;
        }
    }
}