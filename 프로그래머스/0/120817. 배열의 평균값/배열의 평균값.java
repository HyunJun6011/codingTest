class Solution {
    public double solution(int[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result += numbers[i];
        }
        return (result / (numbers.length));
        
    }
}