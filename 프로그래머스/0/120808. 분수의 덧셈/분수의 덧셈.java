class Solution {
    public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, (a % b));
            }
        }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int newDenom = denom1 * denom2;
        int newNumer = numer1 * denom2 + numer2 * denom1;
        int g = gcd(newDenom, newNumer);
        newDenom /= g;
        newNumer /= g;
        
        return new int[]{newNumer, newDenom};
    }
}