import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        // N*N부터 1까지 감소하며 채웁니다.
        int num = N * N; 

        // 0번째 열(j=0)부터 N-1번째 열까지 순회합니다.
        for (int j = 0; j < N; j++) { 
            
            // 현재 열 j의 홀짝성을 판단
            boolean isEvenCol = (j % 2 == 0); 
            
            // N의 홀짝성에 따라 짝수 열(j=0, 2, ...)의 채우기 방향을 결정
            boolean fillDownwards; // 위에서 아래로 채우는가?
            
            if (N % 2 != 0) { // N이 홀수일 때 (N=5): 
                // 짝수 열은 위에서 아래로 (25->21)
                fillDownwards = isEvenCol; 
            } else { // N이 짝수일 때 (N=4):
                // 짝수 열은 아래에서 위로 (16->13)
                fillDownwards = !isEvenCol; // 홀수 열이 위에서 아래로 채워야 함
            }
            
            
            if (fillDownwards) { 
                // 위 -> 아래 (i = 0 부터 N-1 까지 증가)
                for (int i = 0; i < N; i++) {
                    arr[i][j] = num--;
                }
            } else { 
                // 아래 -> 위 (i = N-1 부터 0 까지 감소)
                for (int i = N - 1; i >= 0; i--) {
                    arr[i][j] = num--;
                }
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}