import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int r = in.nextInt();
        int c = in.nextInt();
        int count = 0;
        while (N > 0) {

            int size = 1 << (2 * (N - 1));
            int mid = 1 << (N - 1);

            if (r < mid && c < mid) {
                count += 0;
            } else if (r < mid && c >= mid) {
                count += size;
                c -= mid;
            } else if (r >= mid && c < mid) {
                count += size * 2;
                r -= mid;
            } else {
                count += size * 3;
                r -= mid;
                c -= mid;
            }

            N--;
        }
        System.out.println(count);

    }
}