package Arrays;

/**
 * LeftRotateby1 - arr = [1, 2, 3, 4, 5]
 *                       [2, 3, 4, 5, 1]
 */
public class LeftRotateby1 {
    public static void main(String[] args){
        int [] array = {1, 2, 3, 4, 5};
        int length = array.length;
        int temp = array[0];
        for(int i = 1 ; i <length; i++){
           array[i-1] = array[i];
        }
        array[array.length-1] = temp;
        for(int i = 0 ; i< array.length ; i++){
            System.out.print(" "+array[i]);
        }

    }
}
