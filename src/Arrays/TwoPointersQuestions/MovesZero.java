package Arrays.TwoPointersQuestions;

import java.util.Arrays;
import java.util.Collections;

/*
Input:
nums = [0, 5, 0, 2, 0, 8]

Output:
[5, 2, 8, 0, 0, 0]
 */
public class MovesZero {
    public static void main(String[] args){
        Integer [] nums = {0, 1, 0, 3, 12};//{1,3,12,0,0}
        MovesZero obj = new MovesZero();
        obj.moveZeroes(nums);
    }
    public void moveZeroes(Integer[] nums){
        int j = 0;
        for(int i = 0; i< nums.length ;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for(int arr : nums){
            System.out.print(arr + " ");
        }
    }
}
