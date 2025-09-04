
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] board = new boolean[100][100];
        int N = sc.nextInt();

        for (int k = 0; k < N; k++) {
            int x = sc.nextInt(); // 가로
            int y = sc.nextInt(); // 세로

            for (int i = y; i < y + 10; i++) {
                for (int j = x; j < x + 10; j++) {
                    board[i][j] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j]) area++;
            }
        }

        System.out.println(area);
    }
}