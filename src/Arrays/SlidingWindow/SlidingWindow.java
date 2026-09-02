package Arrays.SlidingWindow;

public class SlidingWindow {

    public static void main(String[] args) {

        SlidingWindow slidingWindow = new SlidingWindow();

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        int result = slidingWindow.maxSumSubarray(arr, k);

        System.out.println(result); // Output: 12
    }

    /*
     * ============================================================
     *                 SLIDING WINDOW ALGORITHM
     * ============================================================
     *
     * Problem:
     * Find the maximum sum of a subarray of size k.
     *
     * Example:
     *
     * arr = [1, 2, 3, 4, 5]
     * k = 3
     *
     * Windows:
     *
     * [1, 2, 3] = 6
     * [2, 3, 4] = 9
     * [3, 4, 5] = 12  <-- Maximum
     *
     * Answer = 12
     *
     *
     * ------------------------------------------------------------
     * BRUTE FORCE APPROACH
     * ------------------------------------------------------------
     *
     * Har window ka sum separately calculate karenge.
     *
     * [1,2,3] -> 1+2+3
     * [2,3,4] -> 2+3+4
     * [3,4,5] -> 3+4+5
     *
     * Isme same elements baar-baar calculate hote hain.
     *
     * Time Complexity = O(n * k)
     *
     *
     * ------------------------------------------------------------
     * OPTIMAL: SLIDING WINDOW
     * ------------------------------------------------------------
     *
     * Pehle window ka sum normally calculate karo.
     *
     * Uske baad poora sum dobara calculate nahi karna.
     *
     * Window ko right side slide karo:
     *
     *      REMOVE OLD ELEMENT
     *              +
     *       ADD NEW ELEMENT
     *
     * Formula:
     *
     * windowSum = windowSum + newElement - oldElement
     *
     * Ya:
     *
     * windowSum += arr[i] - arr[i-k];
     *
     *
     * Example:
     *
     * First window:
     *
     * [1, 2, 3] = 6
     *
     * Next window:
     *
     * [2, 3, 4]
     *
     * 1 bahar gaya
     * 4 andar aaya
     *
     * New sum:
     *
     * 6 - 1 + 4 = 9
     *
     * Next:
     *
     * [3, 4, 5]
     *
     * 2 bahar gaya
     * 5 andar aaya
     *
     * New sum:
     *
     * 9 - 2 + 5 = 12
     *
     *
     * ------------------------------------------------------------
     * IMPORTANT FORMULA
     * ------------------------------------------------------------
     *
     * windowSum += arr[i] - arr[i-k];
     *
     * arr[i-k] = window se bahar jaane wala element
     * arr[i]   = window mein aane wala new element
     *
     *
     * ------------------------------------------------------------
     * GENERAL PATTERN
     * ------------------------------------------------------------
     *
     * 1. First window ka sum calculate karo
     *
     * 2. First window ko answer mein store karo
     *
     * 3. Window ko slide karo
     *
     * 4. Outgoing element subtract karo
     *
     * 5. Incoming element add karo
     *
     * 6. Answer update karo
     *
     *
     * ------------------------------------------------------------
     * COMPLEXITY
     * ------------------------------------------------------------
     *
     * Time Complexity  = O(n)
     * Space Complexity = O(1)
     *
     * ============================================================
     */

    public int maxSumSubarray(int[] arr, int k) {

        int maxSum = 0;
        int windowSum = 0;

        // ---------------------------------------------------------
        // STEP 1:
        // First window ka sum calculate karo.
        //
        // Example:
        // arr = [1,2,3,4,5]
        // k = 3
        //
        // First window = [1,2,3]
        // windowSum = 6
        // ---------------------------------------------------------

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // First window ka sum initially maximum maan lo.
        maxSum = windowSum;


        // ---------------------------------------------------------
        // STEP 2:
        // Ab window ko slide karo.
        //
        // i = k se start hoga.
        //
        // Formula:
        //
        // windowSum += arr[i] - arr[i-k];
        //
        // arr[i]     -> new element jo window mein aa raha hai
        // arr[i-k]   -> old element jo window se bahar ja raha hai
        //
        // Example:
        //
        // window = [1,2,3]
        // sum = 6
        //
        // i = 3
        //
        // arr[3] = 4  -> ADD
        // arr[0] = 1  -> REMOVE
        //
        // 6 + 4 - 1 = 9
        //
        // New window:
        // [2,3,4]
        // ---------------------------------------------------------

        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i] - arr[i - k];

            // Current window ka sum maximum hai ya nahi?
            maxSum = Math.max(maxSum, windowSum);
        }

        // Final maximum sum return karo.
        return maxSum;
    }
}