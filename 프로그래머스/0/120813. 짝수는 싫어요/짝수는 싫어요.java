import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i <= n; i++){
            if(i % 2 == 1 ){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
    
        
        return answer;
    }
}