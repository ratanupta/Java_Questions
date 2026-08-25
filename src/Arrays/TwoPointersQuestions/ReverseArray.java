package Arrays.TwoPointersQuestions;
/*
Input:
nums = [1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
 */
public class ReverseArray {
    public static void main(String[] args){
        int[] nums = {-1 , -2 , -3 , -4 , -5};
        ReverseArray obj = new ReverseArray();
        obj.reverseArray(nums);

    }
    public void reverseArray(int[] nums){
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        while (leftPointer < rightPointer){
            int temp = nums[leftPointer];
            nums[leftPointer] = nums[rightPointer];
            nums[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
