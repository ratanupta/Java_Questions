package Arrays.SlidingWindow;

public class longestOnes {
    public static void main(String[] args) {
        longestOnes longestOnes = new longestOnes();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        int result = longestOnes.longestOnes(nums, k);
        System.out.println(result); // Output: 6
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
