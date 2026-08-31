package Arrays.TwoPointersQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int [] list = new int[]{1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>>result = threeSum.threeSum(list);
        for(List<Integer> res : result){
            System.out.print(res);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int leftArray = i+1;
            int rightArray = nums.length - 1;

            while (leftArray < rightArray) {
                int sum = nums[i] + nums[leftArray] + nums[rightArray];


                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[leftArray], nums[rightArray]));

                    //skip duplicate left
                    while (leftArray < rightArray && nums[leftArray] == nums[leftArray + 1]) {
                        leftArray++;
                    }
                    //skip duplicate right

                    while (leftArray < rightArray && nums[rightArray] == nums[rightArray - 1]) {
                        rightArray--;
                    }

                    leftArray++;
                    rightArray--;

                }

                else if (sum < 0) {
                    leftArray++;
                }

                else {
                    rightArray--;
                }
            }
        }
        return result;
    }
}
