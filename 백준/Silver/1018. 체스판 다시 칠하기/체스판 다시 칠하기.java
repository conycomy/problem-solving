import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		scan.nextLine();

		char[][] chess = new char[M][N];

		for (int i = 0; i < M; i++) {
			String token = scan.nextLine();
			for (int j = 0; j < N; j++) {
				// 토큰에서 j번째 문자를 배열에 저장함
				chess[i][j] = token.charAt(j);
			}
		}

		//최종 결과 변수 초기화
		int minChanges = 64;

		//k: 원도우 시작 행 ( 0부터 M-8 까지 )
		for(int k = 0; k <= M-8; k++) {
			for (int l = 0; l <= N-8; l++) {

				// 8x8 원도우 어쩌고
				int countW = 0;  // 'W' 시작 체스판
				int countB = 0;  // 'B' 시작 체스판

				for(int x = 0; x < 8; x++){
					for(int y = 0; y < 8; y++){

						//실제 보드에서 색상 가져오기 (k+x, l+y는 절대 좌표)
					char currentColor = chess[k + x][l + y];
						if ((x + y) % 2 == 0) {       // 짝수칸
							if (currentColor != 'W') countW++;
							if (currentColor != 'B') countB++;
						} else {                       // 홀수칸
							if (currentColor != 'B') countW++;
							if (currentColor != 'W') countB++;
						}

					}


			}
				int currentMin = Math.min(countW, countB);
				minChanges = Math.min(minChanges, currentMin);
		}
					}

		System.out.println(minChanges);
				}

			}



