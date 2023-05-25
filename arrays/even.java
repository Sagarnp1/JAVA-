/*Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
elements.*/

public class uest{


     public static void main(String[] args) {
        int arra[]={1,2,3,4,5,6,7,8,};
        for(int value: arra){
            if (value%2==0){
                System.out.println(value);
            }
        }
        }
}