package Arrays.TwoPointersQuestions;

public class RemoveDupliCate {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        RemoveDupliCate obj = new RemoveDupliCate();
        int uniqueCount = obj.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.println("Array with unique elements: ");
        for(int i = 0; i < uniqueCount; i++){
            System.out.print(nums[i] + " ");
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
}