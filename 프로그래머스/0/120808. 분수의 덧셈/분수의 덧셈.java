class Solution {
    public int[] solution(int numer1, int denom1,
                          int numer2, int denom2) {
        int[] answer = new int[2];

        if (denom1 == denom2) {
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        } else if (denom1 > denom2) {
            int tempDenom = denom1 * denom2;
            int temp1 = numer1 * denom2;
            int temp2 = numer2 * denom1;

            answer[0] = temp1 + temp2;
            answer[1] = tempDenom;
        } else {
            int tempDenom = denom1 * denom2;
            int temp1 = numer1 * denom2;
            int temp2 = numer2 * denom1;

            answer[0] = temp1 + temp2;
            answer[1] = tempDenom;
        }

        //  약분하기
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;

        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}