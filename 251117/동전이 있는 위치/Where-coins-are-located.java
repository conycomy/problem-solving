import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N x N 격자 
        int M = sc.nextInt(); // M 개의 동전 

        boolean[][] coin = new boolean[N][N];

        for(int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            coin[r-1][c-1] = true;
            
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(coin[i][j] == true) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                System.out.println();
            }
        }

        






    }
}