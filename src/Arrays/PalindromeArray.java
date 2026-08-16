package Arrays;

public class PalindromeArray {
    public static void main(String[] args){
        int[] array = {0,1,2,3,2,1,0};
        int leftPointer = 0 ;
        int rightPointer = array.length-1;
        boolean isPalindrome = true;
        while (leftPointer < rightPointer){
            if(array[leftPointer] != array[rightPointer]){
                isPalindrome = false;
                break;
            }
            leftPointer++;
            rightPointer--;
        }
        if(isPalindrome){
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
