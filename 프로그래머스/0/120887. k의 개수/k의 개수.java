class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int n = i; n <= j; n++) {
            int currentNumber = n;
            
            while (currentNumber > 0) {
                if ((currentNumber % 10) == k) {
                    count++;
                }
                currentNumber /= 10;
            }
        }
        return count;
    }
}