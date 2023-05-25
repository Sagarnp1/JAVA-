/*Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.*/

public class Test{
public static void main (String[] args) {
        int arra[]= {2,6,-5,-1,0,4,-9};
        for (int value: arra){
            if(value>=0){
                System.out.print(value);
            }
        }
    }
}