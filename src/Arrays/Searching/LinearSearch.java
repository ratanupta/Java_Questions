package Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1, 0, -1, 0, -2, 2 , 0 ,3, 0};
        int target = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println("Element found at index: " + i);
            }
        }
        System.out.println("Element not found");
    }
}
