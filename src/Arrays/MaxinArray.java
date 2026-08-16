package Arrays;

public class MaxinArray {
    public static void main(String[] args){
        int[] array = {35,32,10254,23,74,1};
        int max = array[0];
        int length = array.length-1;
        for(int i =0 ; i < length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.print(max);
    }
}
