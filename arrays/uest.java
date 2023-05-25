/*Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
strings stored on odd indices of the array.*/

public class uest{


     public static void main(String[] args) {
        String arrra[]= {"ab", "cd" , "ef"};
        for(int i =0; i<arrra.length; i++){
            if (i%2!=0){
                System.out.println(arrra[i]);
            }
        }
        }
}