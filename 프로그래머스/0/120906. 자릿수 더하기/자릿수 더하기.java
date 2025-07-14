class Solution {
    public int solution(int n) {
        int answer = 0;
        
       String a = Integer.toString(n);
        char[] arr = a.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i] - '0';
        }
        
        return answer;

        }
}
        
        
        
        
    