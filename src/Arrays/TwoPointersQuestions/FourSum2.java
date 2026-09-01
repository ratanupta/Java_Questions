package Arrays.TwoPointersQuestions;

import java.util.HashMap;
import java.util.Map;

public class FourSum2 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        FourSum2 fourSum2 = new FourSum2();
        System.out.println(fourSum2.fourSumCount(nums1, nums2, nums3, nums4));
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> result = new HashMap<>();
        // first two array
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                result.put(sum, result.getOrDefault(sum, 0) + 1);
            }
        }
        //second two array
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum = nums3[i] + nums4[j];
                int req = -sum;
                count += result.getOrDefault(req, 0);
            }
        }

        return count;
    }
}
