class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
         int temp = money / 5500;
        int coin = money % 5500;
        
        answer[0] = temp;
        answer[1] = coin;
        
        return answer;
    }
}