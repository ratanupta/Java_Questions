package Arrays.SlidingWindow;

public class ThresholdSubArray {
    public static void main(String[] args) {
        ThresholdSubArray thresholdSubArray = new ThresholdSubArray();
        int[] arr = {2, 1, 3, 4, 1};
        int k = 3;
        int threshold = 2;
        int result = thresholdSubArray.numOfSubarrays(arr, k, threshold);
        System.out.println(result); // Output: 3
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;

        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        double average = (double) sum / k;
        if (average >= threshold) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            average = (double) sum / k;
            if (average >= threshold) {
                count++;
            }
        }

        return count;
    }
}
