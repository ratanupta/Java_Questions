package Arrays.Sorting;


public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void mergeSort(int[] arr, int left , int right){
        if (left >= right){
            return;
        }
        int midElement = left + (right - left)/2;

        //sort first half
        mergeSort(arr, left, midElement);
        //sort second half
        mergeSort(arr, midElement + 1, right);

        merge(arr, left, midElement, right);
    }

    public void merge(int[] arr , int left , int midElement , int right){
        int[] tempArray = new int[right-left+1];
        int leftPointer = left;
        int rightPointer = midElement + 1 ;
        int tempPointer = 0;
        while(leftPointer <= midElement && rightPointer <= right){
            //compare both values
            if(arr[leftPointer] <= arr[rightPointer]){
                tempArray[tempPointer] = arr[leftPointer];
                leftPointer++;
            }
            else{
                tempArray[tempPointer] = arr[rightPointer];
                rightPointer++;
            }
            tempPointer++;
        }

        // Copy remaining elements from left half
        while(leftPointer <= midElement){
            tempArray[tempPointer] = arr[leftPointer];
            tempPointer++;
            leftPointer++;
        }

        // copy remainig element to the right array
        while(rightPointer<= right){
            tempArray[tempPointer] = arr[rightPointer];
            rightPointer++;
            tempPointer++;
        }

        for (int i = 0; i < tempArray.length; i++) {
            arr[left + i] = tempArray[i];
        }
    }
}
