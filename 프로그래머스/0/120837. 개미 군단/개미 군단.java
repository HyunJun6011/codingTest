class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(true) {
        answer = hp / 5;
        hp = hp % 5;
        if (hp == 0) {
            break;
        }
        answer = answer + hp / 3;
        hp = hp % 3;
        if (hp == 0) {
            break;
        }
        answer = answer + hp / 1;
        hp = hp % 1;
        if (hp == 0) {
            break;
        }
        }
        return answer;
    }
}
// 23 / 5 = 4
// 23 % 5 = 3 
// 3 / 3 = 1