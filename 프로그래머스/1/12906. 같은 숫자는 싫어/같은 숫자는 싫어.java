
import java.util.Stack;
    
public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stackInt = new Stack<>();
        
        for(int i = 0; i<arr.length; i++){
            int x = arr[i];
            if(stackInt.isEmpty() || !stackInt.peek().equals(x)){ 
                stackInt.push(x);
            }
        }
        int[] result = new int[stackInt.size()];
       for(int i = 0; i < stackInt.size(); i++){
            result[i] = stackInt.get(i);
        }
        
        return result;
        }
     
    }
