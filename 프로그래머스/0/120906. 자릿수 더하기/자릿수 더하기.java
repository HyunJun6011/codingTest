class Solution {
    public int solution(int n) {
        String s = n + "";
        String[] arr = s.split("");
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}