class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) { // j=0부터 i 전까지
                if (my_string.charAt(i) == my_string.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}