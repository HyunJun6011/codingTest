class Solution {
    public int[] solution(int money) {
        int[] array = new int[2];
        array[0] = money / 5500;
        array[1] = money % 5500;
        return array;
    }
}

/*
1잔 => 5,500 
배열의 1번째 요소 = 최대로 살 수 있는 아메리카노 잔 수
배열의 2번째 요소 = 남는 돈 
*/
