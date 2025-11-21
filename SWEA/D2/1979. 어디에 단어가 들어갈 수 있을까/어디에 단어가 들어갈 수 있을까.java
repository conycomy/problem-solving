import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //행 부터
            int puzzleIndex = 0;
            for(int i = 0; i < N; i++){
                int count = 0;
                for(int j = 0; j <N; j++){
                    if(arr[i][j] == 1) {
                        count++;
                    } else {
                        count = 0;
                    }

                   if(count == K) {
                       if( j == N-1 || arr[i][j+1] == 0){
                           puzzleIndex++;
                       }
                   }

                }
            }
            //열
            for(int j = 0; j < N; j++){
                int count = 0;
                for(int i = 0; i <N; i++) {
                    if(arr[i][j] == 1){
                        count++;
                    } else {
                        count = 0;
                        }


                    if(count == K) {
                        if (i == N - 1 || arr[i + 1][j] == 0) {
                            puzzleIndex++;
                        }
                    }
                }
            }
            System.out.println("#" + t + " " + puzzleIndex);
        }

    }
}
