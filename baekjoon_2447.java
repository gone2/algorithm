import java.io.*;
import java.util.Arrays;

public class baekjoon_2447 {
    static char[][] arr; // N만큼 2차원 배열 사용
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        star(N, 0, 0);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                bw.append(arr[i][j]);
            }
            bw.append("\n");
        }
        bw.flush();
    }

    public static void star(int N, int x, int y) {
        if (N == 1) { // 마지막 처리 
            arr[y][x] = '*'; 

            return;
        }

        int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(size, i, j);
				} else {
					star(size, i, j);
				}
			}
		}
    }
}
