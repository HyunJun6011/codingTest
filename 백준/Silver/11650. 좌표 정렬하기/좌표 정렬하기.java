import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rb.readLine());

        int[] X = new int[n];
        int[] Y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(rb.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> {
            if (X[a] == X[b]) {
                return Y[a] - Y[b];
            } else {
                return X[a] - X[b];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(X[idx[i]]).append(" ").append(Y[idx[i]]).append("\n");
        }
        System.out.println(sb);
    }
}