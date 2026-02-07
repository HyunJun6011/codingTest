class Solution {
    public int solution(int n) {
        int i = 1;
        while(true) {
            int all = 6 * i; // 전체 조각 수
            if (all % n == 0) {
                return i;
            } else {
                i++;
            }
        }
    }
}