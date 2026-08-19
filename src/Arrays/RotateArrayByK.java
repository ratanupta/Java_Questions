package Arrays;

/*Example 1
Input:
nums = [1, 2, 3, 4, 5]
k = 2
Output:
[3, 4, 5, 1, 2]

Example 2
Input:
nums = [10, 20, 30, 40, 50]
k = 3


Output:
[40, 50, 10, 20, 30]
*/

public class RotateArrayByK {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] temp = new int[nums.length];
         int k = 2;
        int j = 0;
        for(int i = k ; i < nums.length ;i++){
            temp[j++] = nums[i];
        }
        for(int i = 0 ; i < k ; i++){
            temp[j++] = nums[i];
        }
        for(int i = 0 ; i< temp.length ; i++){
            System.out.print(" "+temp[i]);
        }

    }
}
