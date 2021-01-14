// 재귀 - 팩토리얼 (10872)

// 재귀(Recursion) : 자신을 정의할 때 자기자신을 재참조
// 팩토리얼 : n의 팩토리얼은 n!이라고 표시, 이는 1부터 nnn까지의 정수를 곱하는 단순한 연산

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