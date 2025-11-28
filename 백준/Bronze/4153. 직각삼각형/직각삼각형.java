import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 3개의 변 입력받기
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if((a==0) && (b==0) && (c==0)) break;

            int[] arr = {a, b, c};
            Arrays.sort(arr);
            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
                System.out.println("right");
            } else
                System.out.println("wrong");
        }
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 3개의 변 입력받기
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if((a==0) && (b==0) && (c==0)) break;
            String s = " ";
            if (c * c == a * a + b * b) {
                s = "right";
                System.out.println(s);
            } else {
                s = "wrong";
                System.out.println(s);
            }
        }
    }
}

// 3개의 변 중에서 항상 c의 길이가 길다고 해서 틀림.
  10 6 8 와 같은 입력이 들어오면 실제로는 직각삼각형이나 wrong을 출력함.
  따라서 배열에 저장해두고 정렬을 해서 풀면 쉬움,
*/
