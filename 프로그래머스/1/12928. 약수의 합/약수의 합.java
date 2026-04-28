class Solution {
    public int solution(int n) {
        int answer = measure(n);
        return answer;
    }
    static int measure(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            } 
        }
        return sum;
    }
}