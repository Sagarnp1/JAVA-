/*Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
for calculating the minimum element..*/

public class uest{


     public static void main(String[] args) {
        int arra[]={1, 1, 3, 4, 2, 3, 5, 7, 0};
        for(int i=1; i< arra.length-1; i++){
            if (arra[i-1]< arra[i] && arra[i]>arra[i+1]){
                System.out.println(arra[i]);
                break;
            }
        }
        }
}