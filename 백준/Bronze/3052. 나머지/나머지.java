import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        int[] result = new int[10];
        for (int j = 0; j < A.length; j++) {
            result[j] = A[j] % 42;
            }
        boolean[] seen = new boolean[42];
        for (int k = 0; k < result.length; k++) {
            seen[result[k]] = true;
        }
        int count = 0;
        for (int r = 0; r < 42; r++) {
            if (seen[r]) count++;
        }
        System.out.println(count);
    }
}