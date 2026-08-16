package Arrays;

public class ThirdlargestElement {
    public static void main(String[] args){
        int[] arr = {35, 32, 10254, 23, 74, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && largest != secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else {
                if(arr[i] > thirdLargest && thirdLargest != secondLargest && arr[i] != largest){
                    thirdLargest = arr[i];
                }
            }
        }

        System.out.print("Third largest elements in the array is:" + thirdLargest);
    }

}
