
  class Solution {
    // 1. 최대공약수(GCD) 구하기 - 유클리드 호제법
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 2. 최소공배수(LCM) 구해서 판 수 계산하기
    public int solution(int n) {
        int lcm = (6 * n) / gcd(6, n); // 6조각과 n명의 최소공배수
        return lcm / 6; // 한 판당 6조각이니까 나눠서 판 수 계산
    }
}