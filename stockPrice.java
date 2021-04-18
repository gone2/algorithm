public class stockPrice {
    public static void main(String[] arsg) throws Exception {
        int[] prices = {3, 2, 3, 2, 1};

        solution(prices);
    }

    public static int[] solution(int[] prices) throws Exception {
        int[] answer = {};
        answer = new int[prices.length];

        int total = 0;
        for(int p = 0; p < prices.length; p++) {
            for(int s = p+1; s < prices.length; s++) {
                if(prices[p] <= prices[s]) {
                    total++;
                }
                else if(prices[p] > prices[s]) {
                    total++;
                    break;
                }
            }
            answer[p] = total;
            total = 0;
            System.out.println(answer[p]);
        }
        
        return answer;
    }


}
