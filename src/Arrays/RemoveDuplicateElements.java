package Arrays;
import java.util.Arrays;
/**
 🔥 Problem: Remove Element
 Problem Statement
 Given an integer array nums and an integer val, remove all occurrences of val from the array in-place.
 You must modify the original array and should not use another array.
 Return the number of elements that are not equal to val.
 The order of the remaining elements can be maintained.
 Example 1
 Input:
 nums = [3, 2, 2, 3]
 val = 3
 Output:
 2
 Modified array:
 [2, 2, _, _]
 There are 2 elements remaining after removing all 3s.
 Example 2
 Input:
 nums = [0, 1, 2, 2, 3, 0, 4, 2]
 val = 2
 Output:
 5
 Modified array:
 [0, 1, 3, 0, 4, _, _, _]
 */

public class RemoveDuplicateElements {
        public static void main(String[] args) {
            int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
            int value = 2;
            Arrays.sort(nums);
            // [0, 0, 1, 2, 2, 2, 3, 4]
            int uniqueElements = 0;
            for (int scan = 1; scan < nums.length; scan++) {
               if(nums[scan] != value){
                   uniqueElements++;
                   nums[uniqueElements] = nums[scan];
               }
            }
            // Unique elements are from 0 to uniqueElements
            for (int i = 0; i <= uniqueElements; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

