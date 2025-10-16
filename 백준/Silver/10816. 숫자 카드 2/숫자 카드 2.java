import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int countNum = sc.nextInt();
			countMap.put(countNum, countMap.getOrDefault(countNum, 0) + 1);
		}

		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int query = sc.nextInt();
			sb.append(countMap.getOrDefault(query, 0)).append(" ");
		}
		System.out.println(sb);
	}

}
