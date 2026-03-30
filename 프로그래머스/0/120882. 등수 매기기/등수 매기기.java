import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        double[] average = new double[score.length];
        
        for (int i = 0; i < score.length; i++) {
                average[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        // [75, 70, 55, 65]
        
        int[] rank = new int[average.length];
        for (int j = 0; j < average.length; j++) {
            rank[j] = 1;
            for (int k = 0; k < average.length; k++) {
                if (average[k] > average[j]) {
                    rank[j]++;
                }
            }
        }
        return rank;
        }
    }