
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max ,arr[i]);

        }

        boolean[] board = checkBoard(max);

        for(int i = 0; i < arr.length; i++){
            int a = addPrimeNum(board, arr[i]);
            System.out.println(a);

        }
    }

    private static int addPrimeNum(boolean[] board, int b) {
        int count = 0;
        for(int i = 2; i <= b / 2; i++){
            if(board[i] && board[b-i]){
                count++;
            }

        }
        return count;
    }
// 8은 1+7 3+5
    //false = 소수아님
    //true = 소수임

    private static boolean[] checkBoard(int max) {
        boolean[] checkPrimeNum = new boolean[max+1];

        for(int i = 2; i < max; i++) {
            checkPrimeNum[i] = true;
        }

        for(int i = 2; i * i <= max; i++){
            if(checkPrimeNum[i]){
                for(int j = i * i; j <= max; j+=i){
                    checkPrimeNum[j] = false;
                }
            }
        }

        return checkPrimeNum;
    }

}
