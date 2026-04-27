class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int minW = Math.min(wallet[0], wallet[1]);
        int maxW = Math.max(wallet[0], wallet[1]);
        
        int minB = Math.min(bill[0], bill[1]);
        int maxB = Math.max(bill[0], bill[1]);
        
        while (minB > minW || maxB > maxW) {
        if (bill[0] > bill[1]) {
            bill[0] /= 2;
        } else {
            bill[1] /= 2;
        }
            answer += 1;
            
            minB = Math.min(bill[0], bill[1]);
            maxB = Math.max(bill[0], bill[1]);
        }
        return answer;
    }
}