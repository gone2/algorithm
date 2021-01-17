// 2021.01.17
// 재귀 - 피보나치수5 (10870)

//피보나치 : 0과 1로 시작되며 다음 피보나치 수는 이전의 두 수를 합한 값

import java.io.*;

public class baekjoon_10870 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
