import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i < N; i++) {
            int sum = i + totalNum(i);
            if (N == sum) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    static int totalNum(int num) {
        int total = 0;
        while (num > 0) {
            total += num % 10;
            num = num / 10;
        }
        return total;
    }
}