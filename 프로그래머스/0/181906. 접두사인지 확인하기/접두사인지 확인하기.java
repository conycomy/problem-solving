class Solution {
    public int solution(String my_string, String is_prefix) {
        // 1. 길이 체크
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }

        // 2. 문자 하나씩 비교
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;  // 하나라도 다르면 접두사 아님
            }
        }

        return 1; // 전부 다 같으면 접두사 맞음
    }
}