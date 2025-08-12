class Solution {
    public int solution(int n) {

            int fact = 1;
            int i = 1;
        
            while(fact <= n) {
                i++;
                fact *= i;
            }
        
        return i-1;
    }
}