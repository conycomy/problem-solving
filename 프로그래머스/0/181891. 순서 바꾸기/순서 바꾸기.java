import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        // n번째 원소 이후부터 끝까지
        for (int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        // 0번째부터 n-1번째까지
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }

        // 리스트를 int[]로 변환
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        return result;
    }
}