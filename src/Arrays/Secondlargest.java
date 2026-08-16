package Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,-34, 4, 5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i< array.length ;i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
            else {
                if(array[i] > secondLargest && array[i] != largest){
                    secondLargest = array[i];
                }
            }
        }
        System.out.println(secondLargest);
    }
}
