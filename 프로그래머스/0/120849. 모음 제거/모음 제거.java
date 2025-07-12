class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        String[] alpabet = {"a","e","i","o","u"};
        String[] change = {""};
        for(int i = 0; i < alpabet.length; i++) {
            answer = answer.replace(alpabet[i], "");
        }
        
        
        return answer;
    }
}