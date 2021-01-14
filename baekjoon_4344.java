// 2021.01.14
// 1차원 배열 - 평균은 넘겠지 (4344)

import java.util.*;
import java.io.*;

public class baekjoon_4344 {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        // int[] testCase = new int[C];

        for(int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] testCase = new int[st.countTokens()];
            int index = 0;
            while(st.hasMoreTokens()) {
                testCase[index] = Integer.parseInt(st.nextToken());
                index++;
            }

            int sum = 0;
            for(int j = 1; j <= testCase[0]; j++) {
                sum += testCase[j];
            }
            double avg = sum / testCase[0];

            double count = 0;
            for(int k = 1; k <= testCase[0]; k++) {
                if(testCase[k] > avg) {
                    count++;
                }
            }
            bw.append(String.format("%.3f%%", (count / testCase[0]) * 100) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}