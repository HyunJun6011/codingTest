class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letter1 = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letter1.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letter1[i].equals(morse[j])) {
                    answer += alphabet.charAt(j);
                }
            }
        }
        return answer;
    }
}