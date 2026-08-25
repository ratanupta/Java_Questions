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
        int zero = 0;
        int one = 0;
        int two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                swapping(nums, zero, one);
                zero++;
                one++;
            } else if (nums[one] == 1) {
                one++;
            } else {
                swapping(nums, one, two);
                two--;
            }
        }
        for(int arr : nums){
            System.out.print(arr + " ");
        }

    }

    public void swapping(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
