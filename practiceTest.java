import java.util.*;

public class practiceTest {
    public static void main(String[] args) {
        // int[] answers = {1, 2, 3, 4, 5}; // 정답지
        int[] answers = {1,3,2,4,2};

        solution(answers);
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] first  = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third  = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] all = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%5]) {all[0]++;}
            if(answers[i] == second[i%8]) {all[1]++;}
            if(answers[i] == third[i%10]) {all[2]++;}
        }

        int max = Math.max(Math.max(all[0], all[1]),all[2]);

        List<Integer> person = new ArrayList<Integer>();
        if(max == all[0]) {person.add(1);}
        if(max == all[1]) {person.add(2);}
        if(max == all[2]) {person.add(3);}

        Collections.sort(person);

        answer = new int[person.size()];

        for(int i = 0; i < person.size(); i++) {
            answer[i] = person.get(i);
        }

        return answer;
    }
}
