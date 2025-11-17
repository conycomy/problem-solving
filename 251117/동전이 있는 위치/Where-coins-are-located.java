import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N x N 격자 
        int M = sc.nextInt(); // M 개의 동전 
        int[][] arr = new int[N][N];


        boolean isCoinExist = true; 
        for(int i = 0; i < M; i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            for(int a  = 0 ; a < N; a++) {
                for(int b=0; b < N; b++){
                    if(arr[row][column] == arr[a][b]){
                        isCoinExist = true; 
                    } else {
                        isCoinExist = false; 
                    }
                }
                if(isCoinExist){
                    System.out.print("1" + " ");

                }else {
                    System.out.print("0" + " ");
                }
            }
        
        }






    }
}