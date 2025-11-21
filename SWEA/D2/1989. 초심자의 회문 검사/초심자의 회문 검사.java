import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 1; t <= T; t++){
            String s = sc.next();
            char[] chars = s.toCharArray();
            String reversed = "";

            for(int i = chars.length -1; i >=0; i--){
                reversed += chars[i];
            }

            if(s.equals(reversed)){
                System.out.println("#"+t +" "+ 1);
            } else{
                System.out.println("#"+t + " "+0);
            }




        }


    }

}
