package Arrays.SlidingWindow;

public class maxVowels {
    public static void main(String[] args) {
        maxVowels maxVowels = new maxVowels();
        String s = "abciiidef";
        int k = 3;
        int result = maxVowels.maxVowels(s, k);
        System.out.println(result); // Output: 3
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
