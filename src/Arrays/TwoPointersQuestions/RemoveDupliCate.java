package Arrays.TwoPointersQuestions;

public class RemoveDupliCate {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2,2, 3, 4, 4, 5};
        int[] nums2 = {1, 1, 1, 2, 2, 3};
        RemoveDupliCate obj = new RemoveDupliCate();
        int uniqueCount = obj.removeDuplicates(nums);

        int uniqueCount2 = obj.removeDuplicate(nums2);

        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.println("Array with unique elements: ");
        for(int i = 0; i < uniqueCount; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Number of unique elements (with at most two duplicates): " + uniqueCount2);
        System.out.println("Array with at most two duplicates removed: ");
        for(int i = 0; i < uniqueCount2; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }

    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int uniqueIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex ;
    }

    public int removeDuplicate(int[] nums) {

        int j =2;
        for(int i = 2; i < nums.length;i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}