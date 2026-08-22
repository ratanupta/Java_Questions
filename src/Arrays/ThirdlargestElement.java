package Arrays;

import java.util.Arrays;

public class ThirdlargestElement {
    public static void main(String[] args){
        int[] array = {99, 6, 43, 2, 3, 56, 7, 0, 1};
        int length = array.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        Arrays.sort(array);
        for(int i = 0 ; i < length ; i++){
            if(array[i] > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            else if (array[i] > secondLargest && array[i] != firstLargest){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }
            else {
                if(array[i] > thirdLargest && array[i] != secondLargest && array[i] != firstLargest){
                    thirdLargest = array[i];
                }
            }
        }
        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Third Largest: " + thirdLargest);
    }

}
