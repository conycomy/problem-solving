import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt(); //영식이꼬 랜선 개수
		int N = sc.nextInt(); //필요한 랜선의 개수

		int[] a = new int[K];

		for(int i = 0; i < K; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		long start = 1; // 처음 시작
		long end = a[a.length - 1]; // 배열에서 가장 큰 수
		long result = 0;

		while(start <= end) { // 언제 끝날지 모르므로 while문
			long mid = (start + end) / 2; //중앙 값 설정
			long TotalMade = 0; // 총 몇개의 랜선을 얻을 수 있는지 세는 변수임
			for(int length : a){
				TotalMade += length / mid;
			}
			if(TotalMade >= N) {
				result = mid;
				start = mid +1;
			} else {
				end = mid -1;
			}
	
		}

		System.out.println(result);
	}

}
