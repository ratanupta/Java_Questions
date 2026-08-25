package Arrays.TwoPointersQuestions;

import java.util.Arrays;

/*
Input:
[-4, -1, 0, 3, 10]
Output:
[0, 1, 9, 16, 100]
 */
public class SquareSorted {
    public  static void main (String[] args){
        int[] array = {-4, -1, 0, 3, 10};
        int[] result = new int[array.length];
        int leftSquare = 0;
        int rightSquare = array.length - 1;
        int index = array.length -1;
        while (leftSquare <= rightSquare){
            int leftResult = array[leftSquare] * array[leftSquare];
            int rightResult = array[rightSquare] * array[rightSquare];
            if(leftResult > rightResult){
                result[index] = leftResult;
                leftSquare++;
            }
            else {
                result[index] = rightResult;
                rightSquare--;
            }
            index--;
        }
        System.out.println(Arrays.toString(result));

        //................................................//

//        int [] array = {-4, -1, 0, 3, 10};
//        for(int i = 0 ; i< array.length ; i++){
//            array[i] *= array[i];
//        }
//        for(int i = 0 ; i< array.length ; i++){
//            for(int j = i+1 ; j< array.length ; j++){
//                if(array[i] > array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.println("Squared array:");
//        for(int i = 0 ; i< array.length ; i++){
//            System.out.print(array[i] + " ");
//        }
    }
}
