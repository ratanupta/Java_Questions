package Arrays;
/*
Input:  nums = [2, 2, 1]
Output: 1
 */
public class findNumberinArray1 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 2, 7, 995, 7, 2, 1, 1, 3, 3, 5, 5, 5, 5, 5};
        findNumberinArray1 obj = new findNumberinArray1();
        obj.findNumber(nums);
        obj.findNumberXOR(nums);
    }
    //xor  approach to find the number that appears only once in the array
    /*
     a^a=0 -- 2^2=0
     a^0=a -- 2^0=2
     2^4^4^2^7^995^7^2^1^1^3^3^5^5^5^5^5
     2^2^4^4^7^7^995^1^1^3^3^5^5^5^5^5
     0^0^0^0^0^995^0^0^0^0^0
     995
    */
    public void findNumberXOR(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        System.out.println("xor result : " + result);
    }
    //brute force approach to find the number that appears only once in the array
    public void findNumber(int[] nums) {
        //time complexity is O(n^2) and space complexity is O(1)
        for (int i = 1; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("brute force result : " + nums[i]);
            }

        }
    }

}

