import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] hasCoin = new boolean[N][N]; 

        for(int i = 0; i < M; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            hasCoin[r][c] = true; 

        }

        int count = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++){
                if(hasCoin[i][j] == true){
                    System.out.print(count + " ");
                    count++;
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        

         

        
        
    }
}
