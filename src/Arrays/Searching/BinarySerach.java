package Arrays.Searching;

public class BinarySerach {

    public static void main(String[] args) {

        int[] array = {23, 43, 45, 64, 67, 78, 90};

        BinarySerach binarySerach = new BinarySerach();

        int target = 78;

        int result = binarySerach.binaSearch(array, target);

        System.out.println("Index value of target is: " + result);

        if (result != -1) {
            System.out.println("Value at index is: " + array[result]);
        }
    }

    public int binaSearch(int[] array, int target) {

        int leftPart = 0;
        int rightPart = array.length - 1;

        while (leftPart <= rightPart) {

            int middlePart =
                    leftPart + (rightPart - leftPart) / 2;

            if (array[middlePart] == target) {
                return middlePart;
            }

            else if (array[middlePart] < target) {
                leftPart = middlePart + 1;
            }

            else {
                rightPart = middlePart - 1;
            }
        }

        return -1;
    }
}