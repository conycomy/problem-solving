//가위는 2 바위는 0 보는 5로 표현
//rsp에 저장된 가위 바위 보를 모두 이기는 경우
// 가위(2)는 보(5)를 이겨
// 바위(0)는 가위(2)를 이겨
// 보(5)는 바위(0)를 이겨 

class Solution {
    public String solution(String rsp) {
        
       StringBuilder answer = new StringBuilder();
        
      for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);

            if (ch == '2') {
                answer.append('0'); // 이긴 걸 추가
            } else if (ch == '0') {
                answer.append('5');
            } else if (ch == '5') {
                answer.append('2');
            }
        }
                return answer.toString(); // StringBuilder를 문자열로 바꿔서 반환

        }
    }

