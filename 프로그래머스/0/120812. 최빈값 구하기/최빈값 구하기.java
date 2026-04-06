class Solution { 
    public int solution(int[] array) {
        int[] array2 = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array2[array[i]]++;
        }
        int max = array2[0]; // max = 0;
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            } 
        }
        int mode = -1;
        int cnt = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == max) {
                cnt++;
                mode = i;
            }
        }
        if (cnt > 1) {
            return -1;
        } else {
            return mode;
        }
        }
}