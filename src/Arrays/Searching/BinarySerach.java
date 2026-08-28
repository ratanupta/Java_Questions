package Arrays.Searching;

import java.awt.image.BufferedImage;

public class BinarySerach {
    public static void main(String[] args) {
        int[] array = {23, 43, 64, 78, 45, 90, 67};
        BinarySerach binarySerach = new BinarySerach();
        int target = 78;
        int result = binarySerach.binaSearch(array, target);
        System.out.print("Index value of target is :" + result +"also values of index values is"+ array[result]);
    }

    public int binaSearch(int[] array, int target) {
        int smallPart = 0;
        int highestPart = array.length - 1;
        int middlePart = smallPart + (highestPart - smallPart) / 2;
        while (smallPart < highestPart) {
            if (array[middlePart] == target) {
                return middlePart;
            } else if (array[middlePart] > target) {
                smallPart = middlePart + 1;
            } else {
                highestPart = middlePart - 1;
            }
        }
        return -1;
    }
}
