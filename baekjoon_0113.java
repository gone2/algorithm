// 재귀 - 팩토리얼 (10872)

import java.io.*;

public class baekjoon_0113 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N < 0 || N > 12) return;
        
        int num = factorial(N);
        System.out.println(num);
    }

    public static int factorial(int N) {
        if(N <= 1) return 1;

        return N * factorial(N - 1);
    }
}