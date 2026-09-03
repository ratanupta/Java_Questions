package Arrays.SlidingWindow;

public class maxSatisfied {

    public static void main(String[] args) {
        maxSatisfied maxSatisfied = new maxSatisfied();
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int X = 3;
        int result = maxSatisfied.maxSatisfied(customers, grumpy, X);
        System.out.println(result); // Output: 16
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int totalSatisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }

        int additionalSatisfied = 0;
        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 1) {
                additionalSatisfied += customers[i];
            }
        }

        int maxAdditionalSatisfied = additionalSatisfied;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                additionalSatisfied += customers[i];
            }
            if (grumpy[i - X] == 1) {
                additionalSatisfied -= customers[i - X];
            }
            maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, additionalSatisfied);
        }

        return totalSatisfied + maxAdditionalSatisfied;
    }
}
