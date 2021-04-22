import java.util.*;

public class print {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};  // {1, 1, 9, 1, 1, 1}
        int location = 2;                       // 0

        solution(priorities, location);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority : priorities) {
            pq.offer(priority);
        }

        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(pq.peek() == priorities[i]) {
                    if(location == i) {
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
            break;
        }
        System.out.println(answer);


        return answer;
    }
}
