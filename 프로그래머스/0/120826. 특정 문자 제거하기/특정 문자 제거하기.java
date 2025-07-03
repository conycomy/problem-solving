class Solution {
    public String solution(String my_string, String letter) {
    StringBuilder answer = new StringBuilder(); 
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
             if(c != letter.charAt(0)){
            answer.append(c);
        }
        
        }

       
        
        return answer.toString();
    }
}