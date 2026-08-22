package Arrays;

/**
 * RightArrayRotateByK
 * Input:
 * nums = [10, 20, 30, 40, 50]
 * k = 3
 *
 * Output:
 * [30, 40, 50, 10, 20]
 */

public class RightArrayRotateByK {
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int k = 5;
        int[] temp = new int[nums.length];
        int j = 0;
        for(int i = nums.length-k ; i < nums.length ;i++){
            temp[j++] = nums[i];
        }

        for(int i = 0 ; i < nums.length-k ; i++){
            temp[j++] = nums[i];
        }
        for(int i = 0 ; i< temp.length ; i++){
            System.out.print(" "+temp[i]);
        }

//        for(int i = k-1; i < nums.length ;i++){
//            temp[j++] = nums[i];
//        }
//        for(int i = 0 ; i < k-1 ; i++){
//            temp[j++] = nums[i];
//        }
//        for(int i = 0 ; i< temp.length ; i++){
//            System.out.print(" "+temp[i]);
//        }

    }
}
