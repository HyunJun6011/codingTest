import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] a = new Integer[8];
        String str = " ";
        for (int j = 0; j < a.length; j++) {
            a[j] = in.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] == a[i] + 1) {
                str = "ascending";
            } else if (a[i + 1] == a[i] - 1) {
                str = "descending";
            } else {
                str = "mixed";
                break;
            }
        }
        System.out.println(str);
    }
}
