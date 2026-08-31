package Arrays.Searching;

import java.awt.image.BufferedImage;

public class BinarySerach {
    public static void main(String[] args) {
        int[] array = {23, 43, 64, 78, 45, 90, 67};
        BinarySerach binarySerach = new BinarySerach();
        int target = 78;
        int result = binarySerach.binaSearch(array, target);
        System.out.print("Index value of target is :" + result + "\nalso values of index values is"+ array[result]);
    }

    public int binaSearch(int[] array, int target) {
        int leftPart = 0;
        int rightPart = array.length-1;
        int middlePart = leftPart + (rightPart -leftPart) /2;
        while(leftPart < rightPart){
            if(array[middlePart] == target){
                return middlePart;
            } else if (array[middlePart] < target) {
                rightPart = middlePart-1;
                rightPart--;
            }
            else {
                leftPart = middlePart+1;
                leftPart++;
            }
        }
        return -1;
    }
}
