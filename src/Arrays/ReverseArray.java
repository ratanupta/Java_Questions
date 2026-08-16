package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] array = {23,123,56,235,75,87};
        int leftPointer = 0 ;
        int rightPointer = array.length-1;
        while (leftPointer < rightPointer){
            int temp = array[leftPointer];//T-56
            array[leftPointer] = array[rightPointer];//L-235
            array[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }
}
