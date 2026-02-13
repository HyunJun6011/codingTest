class Solution {
    public int[] solution(int[] num_list) {
        int[] count = new int[2];
        for (int i = 0; i < num_list.length; i++) { // 배열을 돌자
                if (num_list[i] % 2 == 0) { // num_list의 배열 요소가 짝수라면
                    count[0]++; // 짝수를 세는 변수인 even을 하나 추가
                } else { // 짝수가 아니라면
                    count[1]++; // 홀수를 세는 변수인 odd를 하나 추가
                }
        }
        return count;
    }
}