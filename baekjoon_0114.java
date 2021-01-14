// 1차원 배열 - 최대,최소 (10818)

// StringTokenizer : 사용자가 지정한 구분자를 기준으로 문자열을 나눠주는 클래스
// hasMoreTokens() : StringTokenizer 클래스 객체에서 읽어 들일 문자가 있으면 true 없으면 false
// nextToken()     : StringTokenizer 클래스 객체에서 다음 값을 가져옴

import java.io.*;
import java.util.*;

public class baekjoon_0114 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[N];
        int num = 0;

        while(st.hasMoreTokens()) {
           arr[num] = Integer.parseInt(st.nextToken());
           num++;
        }
        //or
        // for(int i = 0; i < N; i++) {
        //     arr[i] = Integer.parseInt(st.nextToken());
        // }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}