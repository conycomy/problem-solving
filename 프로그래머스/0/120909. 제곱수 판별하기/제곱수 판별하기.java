class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0 ){
            answer = 1; 
        } else if (n % 2 != 0){
            answer = 2;
        }
        
        return answer;
    }
}