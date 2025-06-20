class Solution {
    public int solution(int n) {
        if ( n<= 0) return 0;
        if (n % 2 == 0) {
            return n + solution(n-2);
        } else {
            return solution(n-1);
        }
        
        
    }
}