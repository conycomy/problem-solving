// 원소의 평균값을 리턴 해야함
// double 봐야됨 
class Solution {
    public double solution(int[] numbers) {
        double sum = 0; 
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        double answer = sum / numbers.length;
        return answer;
    }
}