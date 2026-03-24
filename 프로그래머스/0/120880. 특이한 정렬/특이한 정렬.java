import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted((a, b) -> {
                int n1 = Math.abs(a - n);
                int n2 = Math.abs(b - n);
                if (n1 == n2) {
                    return Integer.compare(b, a);
                } else {
                    return Integer.compare(n1, n2);
                }
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }
}