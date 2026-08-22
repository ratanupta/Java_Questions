package Arrays.TwoPointersQuestions;

import java.util.Arrays;

/*
Input:
nums = [3, 2, 4]
target = 6
Output:
[1, 2]
*/
public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 2,1, 4, 3, 7, 9,2, 4, 5, 2, 99};
        int target = 10;
        TwoSums twoSum = new TwoSums();
        int[] result = twoSum.twoSum(nums, target);
        if (result.length == 4) {
            System.out.println("Values: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Indices: [" + result[2] + ", " + result[3] + "]");
        } else {
            System.out.println("No solution found.");
        }

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j] , i , j} ;
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }
}

