class Solution {
    public int solution(int[][] dots) {
        for (int i = 1; i < 4; i++) {
            // 0번 점과 i번 점의 변화량
            int x1 = dots[i][0] - dots[0][0];
            int y1 = dots[i][1] - dots[0][1];
            
            // 나머지 두 점 찾기
            int other1 = 0;
            int other2 = 0;
            
            if (i == 1) {
                other1 = 2; other2 = 3;
            } else if (i == 2) {
                other1 = 1; other2 = 3;
            } else if (i == 3) {
                other1 = 1; other2 = 2;
            }
            
            // 나머지 두 점의 변화량
            int x2 = dots[other2][0] - dots[other1][0];
            int y2 = dots[other2][1] - dots[other1][1];
                
            // y1/x1 == y2/x2  =>  y1 * x2 == y2 * x1 (교차 곱셈)
            if ((long)y1 * x2 == (long)y2 * x1) {
                return 1;
            }
        }
        return 0;
    }
}