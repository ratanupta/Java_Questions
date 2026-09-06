package Arrays.SlidingWindow;

public class minSubArrayLen {
    public static void main(String[] args) {
        minSubArrayLen minSubArrayLen = new minSubArrayLen();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = minSubArrayLen.minSubArrayLen(target, nums);
        System.out.println(result); // Output: 2
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
