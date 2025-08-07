class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++){
            char[] chars = String.valueOf(a).toCharArray();
            
            for(char c : chars){
                if( c == (char)(k + '0')){
                    answer++;
                }
            }
            
        }
    
        
        
        return answer;
    }
}