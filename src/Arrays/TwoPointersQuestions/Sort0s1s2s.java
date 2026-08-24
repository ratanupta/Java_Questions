package Arrays.TwoPointersQuestions;

/*
Input:
nums = [2, 0, 2, 1, 1, 0]
Output:
[0, 0, 1, 1, 2, 2]
 */
public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Sort0s1s2s obj = new Sort0s1s2s();
        obj.sortColors(nums);
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swapping(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swapping(nums, mid, high);
                high--;
            }

        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public void swapping(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
