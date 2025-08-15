class Solution {
    public int solution(int[] array, int n) {
        int minDiff = Integer.MAX_VALUE;
        int best = Integer.MAX_VALUE;

        for (int x : array) {
            int diff = (x >= n) ? (x - n) : (n - x); 

            if (diff < minDiff) {
                minDiff = diff;
                best = x;
            } else if (diff == minDiff && x < best) { // 같은 거리면 더 작은 수
                best = x;
            }
        }
        return best;
    }
}