import java.io.*;
import java.util.*;

public class queue {
    public static void main(String[] args) throws Exception {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        
        solution(bridge_length, weight, truck_weights);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) throws Exception {
        int answer = 0;
        Queue<Integer> truck = new LinkedList<Integer>();

        int max = 0;
        for(int w : truck_weights) {

            while(true) {
                if(truck.isEmpty()) {       //트럭 배열이 비어있을 때
                    truck.offer(w);         //큐에 트럭 무게를 담는다.
                    max += w;               //트럭 무게를 총 무게와 더한다.
                    answer++;               //1초 증가
                    break;

                } else if(truck.size() == bridge_length) {  //다리 길이가 꽉 찼을 때
                    max -= truck.poll();                    //총 무게에서 첫번째 트럭 무게를 뺀다.

                } else {                    //트럭 배일이 비어있지도 다리 길이가 꽉 차지도 않았을 때
                    if(max + w > weight) {  //기존에 담긴 트럭 무게와 새로 담길 트럭 무게가 설정 값보다 크면
                        truck.offer(0);     //트럭 무게 배열에 0을 넣는다.
                        answer++;           //1초 증가


                    } else {                //기존에 담긴 트럭 무게가 새로 담길 트럭 무게가 설정 값 안에 존재하면
                        truck.offer(w);     //트럭 무게 배열에 새로 담길 트럭 무게를 넣는다.
                        max += w;           //총 무게에 새로 담길 트럭 무게를 더한다.
                        answer++;           //1초 증가
                        break;
                    }
                    
                }
            }
        }
        return answer + bridge_length;
    }
}
