package Arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * MoveZeroEnd- arr = [0, 1, 0, 3, 12]
 *                    [1, 3, 12, 0, 0]
 */
public class MoveZeroEnd {
    public static void main(String[] args){
        Integer[] array = {0,2,0,0,0,0,42,4,240,0,0,0,0,0,0,2,5,2,4,5,3};
        int length = array.length;
        int j = 0 ;
        for(int i = 0 ; i < array.length ; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
        for(int i = 0 ; i< array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }
}
