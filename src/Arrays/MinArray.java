package Arrays;

public class MinArray {
    public static void main(String[] args){
        int[] array = {35,32,10254,23,74,1};
        int min = array[0];
        int length = array.length;
        for(int i =1 ; i < length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print(min);
    }
}
