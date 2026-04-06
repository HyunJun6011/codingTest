class Solution {
    public int solution(int n) {
        int count = 0;
        int fact = 1;
        while (fact <= n) {
            count++;
            fact *= (count + 1);
        }
        return count;
    }
}