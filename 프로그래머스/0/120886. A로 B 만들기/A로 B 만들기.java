import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);
        if (Arrays.equals(a, b)) {
            return 1;
        } else return 0;
    }
}