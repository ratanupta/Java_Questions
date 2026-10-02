package Arrays.TwoPointersQuestions;

public class TrappingWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingWater trappingWater = new TrappingWater();
        System.out.println(trappingWater.trap(height));
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while(left < right){
            if(height[left] < height[right]){
                leftMax = Math.max(leftMax , height[left]);
                waterTrapped = waterTrapped + leftMax - height[left];
                left++;
            }
            else {
                rightMax = Math.max(rightMax ,height[right]);
                waterTrapped = waterTrapped + rightMax - height[right];
                right--;
            }
        }
        return waterTrapped;
    }
}
