package Arrays;
import java.util.Arrays;
import java.util.Collections;

public class CopyOnetoAnother {
    public static void main(String[] args){
        Integer[] array1 = {32,12,43,65,8,4,373,24,56,34};
        Integer[] array2 = new Integer[array1.length];
        for(int i = 0 ;i < array1.length ; i++){
            array2[i] = array1[i];
        }
        Arrays.sort(array2, Collections.reverseOrder());
        for(int i = 0 ;i < array2.length ; i++){
            System.out.print(" "+array2[i]);
        }
    }
}
