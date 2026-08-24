package Arrays.TwoPointersQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input:
nums = [1, 5, 3, 7, 2]
target = 8
Output:
[1, 7]
[5, 3]// each array has two numbers that add up to the target sum. The order of the pairs may vary.

 */
public class PairWithGivenSum {
    public static void main(String[] args){
        int[] nums = {1, 5, 1,1,3, 7, 2};
        int target = 8;
        PairWithGivenSum obj = new PairWithGivenSum();
        List<int[]> result =  obj.findPairs(nums,target);
        System.out.println("Pairs with given sum:");
        for(int[] pair : result){
            for(int num : pair){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // list solution method is calling
        List<List<Integer>> result1 =  obj.findPairsWithTwoPointerApproach(nums,target);
        System.out.println("Pairs with given sum using two pointer approach:");
        for(List<Integer> pair : result1){
            for(int num : pair){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    // two pointer approach to find all pairs in an array that add up to a specific target sum
    public List<List<Integer>> findPairsWithTwoPointerApproach(int[] nums , int target){
        List<List<Integer>> pairs = new ArrayList<>();
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer < rightPointer){
            int sum = sortedNums[leftPointer] + sortedNums[rightPointer];
            if(sum == target){
                pairs.add(Arrays.asList(sortedNums[leftPointer] , sortedNums[rightPointer]));
                leftPointer++;
                rightPointer--;
            } else if (sum < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return pairs;
    }

    public List<int[]> findPairs(int[] nums , int target){
        List<int[]> pairs = new ArrayList<>();

        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    pairs.add(new int[]{nums[i], nums[j]});
                }
            }
        }
        return pairs;
    }
}
