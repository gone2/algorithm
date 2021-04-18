import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {
    public static void main(String[] args) throws Exception {
        // int[] progresses = {93, 30, 55};
        // int[] speeds = {1, 30, 5};

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        solution(progresses, speeds);
    }

    public static int[] solution(int[] progresses, int[] speeds) throws Exception {
        int[] answer = {};

        // 하루에 완료 퍼센트 큐에 옮기기
        Queue<Integer> q = new LinkedList<>();
        for(int i : speeds) {
            q.offer(i);
        } // 끝

        // progresses 완료하는 일자 구하기
        int day = 0;
        Queue<Integer> qDay = new LinkedList<>();

        for (int i : progresses) {
            int sp = q.poll();

            while(i < 100) {
                i += sp;
                day++;
            }
            qDay.offer(day);
            day = 0;
        } // 끝

        // 배포 배열 구하기
        int count = 1;
        Queue<Integer> push =  new LinkedList<>();
        
        int firstProgress = qDay.poll();
        while(!qDay.isEmpty()) {

            if(firstProgress < qDay.peek()) {
                push.offer(count);
                firstProgress = qDay.poll();
                count = 1;
            
            } else if(firstProgress >= qDay.peek()) {
                count++;
                qDay.poll();
            }
        }
        push.offer(count);
        
        int queSize = push.size();
        answer = new int[queSize];

        for(int i = 0; i < queSize; i++) {
            answer[i] = push.poll();
        } // 끝

        return answer;
    }
}
