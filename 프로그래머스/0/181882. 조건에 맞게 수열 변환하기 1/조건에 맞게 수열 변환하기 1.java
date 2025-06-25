class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // 50 이상이고 짝수면 2로 나눔
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            }
            // 50 미만이고 홀수면 2로 곱함
            else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            }
            else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}