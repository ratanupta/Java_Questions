package Arrays;

import java.util.Arrays;

/*
You are given an array containing n distinct numbers taken from the range 0 to n.
😃Exactly one number is missing from the array. Find and return the missing number.
Example 1:
Input:  nums = [3, 0, 1]
Output: 2
Example 2:
Input:  nums = [0, 1]
Output: 2
Example 3:
Input:  nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
Output: 8

😃
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums1 = {3, 0, 1 ,91}; // that one is not a valid array because in this array number will be on o to n ok
        FindMissingNumberInArray obj = new FindMissingNumberInArray();
        obj.sumFormula(nums);
        obj.bruteForce(nums);
        obj.xorMethod(nums);
    }

    public void xorMethod(int[] nums) {
        int n = nums.length;
        int xorAll = 0;
        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }
        int xorArray = 0;
        for (int num : nums) {
            xorArray ^= num;
        }
        System.out.println("Missing Number: " + (xorAll ^ xorArray));
    }
    public void sumFormula(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }

    public void bruteForce(int[] nums) {
        // solve this by brute force approach
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing Number: " + i);
                break;
            }

        }
    }
}