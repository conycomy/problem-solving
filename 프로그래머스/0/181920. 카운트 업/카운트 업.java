import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = start_num; i<=end_num; i++){
           answerList.add(i);
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i); 
        }
        return answer;
    }
}