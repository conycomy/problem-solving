class Solution {
//myString에서 pat의 문자열이 있을시, 1을 리턴함 
    //그렇지 않으면 0을 리턴함 
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        int answer = 0;
       if(myString.indexOf(pat) != -1) {
          answer = 1;
       } else {
            answer = 0;
       }
        return answer;
    }
}