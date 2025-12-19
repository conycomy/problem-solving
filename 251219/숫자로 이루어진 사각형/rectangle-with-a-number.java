import java.util.Scanner;
public class Main {

    private static void printSquare(int[][] arr , int N){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];


        int num = 1; 
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(num > 9){
                    num = 1;
                }

                
                arr[i][j] = num;
                num++;
            }
        }


        printSquare(arr, N);


    }
}

// 출력하라. 
// 출력하는 함수만 따로