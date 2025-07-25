//가위는 2 바위는 0 보는 5로 표현
//rsp에 저장된 가위 바위 보를 모두 이기는 경우
// 가위(2)는 보(5)를 이겨
// 바위(0)는 가위(2)를 이겨
// 보(5)는 바위(0)를 이겨 

class Solution {
    public String solution(String rsp) {
        
        String answer = "";
        char[] arr = rsp.toCharArray(); //1. 문자열을 문자 배열로 만들 것임
        
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == '2'){
                answer += "0";
            } else if (arr[i] == '0'){
                answer += "5";
            } else if (arr[i] == '5'){
                answer += "2";
            }
        }

       return answer;
    }
}