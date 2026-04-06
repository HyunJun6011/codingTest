class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        String[] arr1 = new String[array.length];
        for (int i = 0; i < arr1.length; i++) {
            str += Integer.toString(array[i]);
        }
        String[] arr2 = str.split("");
        for (String s : arr2) {
            if (s.equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}