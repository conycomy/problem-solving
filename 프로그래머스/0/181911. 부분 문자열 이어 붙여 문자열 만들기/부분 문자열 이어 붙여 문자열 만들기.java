class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
    
        for(int i=0; i<my_strings.length; i++){  
            int start = parts[i][0];
            int ends= parts[i][1]+1;
            
            String sub = my_strings[i].substring(start, ends);
            sb.append(sub);
            

            
            
        }
        
        
        
        
      
        
        
        
        return sb.toString();
    }
}