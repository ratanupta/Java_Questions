package Arrays.SlidingWindow;

public class characterReplacement {

    public static void main(String[] args) {
        characterReplacement characterReplacement = new characterReplacement();
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement.characterReplacement(s, k);
        System.out.println(result); // Output: 4
    }

    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxCount = 0;
        int[] count = new int[26];

        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
