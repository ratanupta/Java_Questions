package Arrays.TwoPointersQuestions;

public class thirdLargest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 73, 45, 55};
        thirdLargest obj = new thirdLargest();
        int thirdLargest = obj.findThirdLargest(array1);
        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("There is no third largest element in the array.");
        } else {
            System.out.println("The third largest element in the array is: " + thirdLargest);
        }
    }

    public int findThirdLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];

            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = array[i];
            } else {
                if (array[i] > thirdLargest && array[i] != secondLargest && array[i] != firstLargest) {
                    thirdLargest = array[i];
                }
            }
        }
        return thirdLargest;
    }
}
