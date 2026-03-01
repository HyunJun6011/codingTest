import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxIndex = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int key = keys.next();
            int value = map.get(key);
            if (maxValue < value) {
                maxIndex = key;
                maxValue = value;
            }
        }
        return new int[] {maxValue, maxIndex};
    }
}