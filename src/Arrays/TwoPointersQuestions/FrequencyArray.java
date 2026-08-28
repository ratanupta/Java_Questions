package Arrays.TwoPointersQuestions;

import java.util.HashMap;
import java.util.Map;

/*Input:
nums = [1, 2, 2, 3, 1, 4, 2, 3]

Output:
        1 → 2
        2 → 3
        3 → 2
        4 → 1

 */
public class FrequencyArray {
    public static void main(String[] ar) {
        int x[] = {1, 2, 2, 3, 1, 4, 2, 3};
        int n = x.length;
        int freq[] = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(x[i],map.getOrDefault(x[i],0)+1);
        }

        System.out.println(map);
    }
}