package Arrays.TwoPointersQuestions;
/*
Input:
height = [1,8,6,2,5,4,8,3,7]
Output:
49
 */
public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int maxArea = obj.findMostWaterInContainer(height);
        System.out.print("Max contain water : " + maxArea);
    }

    public int findMostWaterInContainer(int[] height){
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        while (leftPointer <= rightPointer){
            int widthOfContainer = rightPointer-leftPointer;
            int heightOfMaxWater = Math.min(height[leftPointer] , height[rightPointer]);
            int area = widthOfContainer * heightOfMaxWater;
            maxArea = Math.max(maxArea , area);
            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        return maxArea;
    }

}
