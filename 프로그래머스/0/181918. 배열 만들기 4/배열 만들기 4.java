import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        int[] stk = new int[arr.length];
        int size = 0; 

        while(i < arr.length){
            if(size == 0) {
                stk[size++] = arr[i];
                i++;
            } else if (stk[size -1] < arr[i]){
                stk[size++] = arr[i];
                i++;
            } else {
                size--;
            }
            
            
        }
      
        
        return Arrays.copyOf(stk, size); 
    }
}