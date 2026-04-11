import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 티셔츠 사이즈 입력받을 배열 선언 후 요소에 값 채워넣기
        int[] sizes = new int[6];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st1.nextToken());
        }

        // 티셔츠와 펜 묶음 수 입력받을 배열 선언 후 요소에 값 채워넣기
        int[] arr2 = new int[2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        
        int count = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] % arr2[0] != 0) {
                count += sizes[i] / arr2[0] + 1;
            } else {
                count += sizes[i] / arr2[0];
            }
        }
        System.out.println(count);
        System.out.println((N / arr2[1]) + " " + N % arr2[1]);
    }
}