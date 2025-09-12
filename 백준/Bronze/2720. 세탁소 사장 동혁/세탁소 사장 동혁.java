
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] coin = {25, 10, 5, 1};


		for(int i = 0; i < T; i++) {
			int c = sc.nextInt();
			int[] cnt = new int[4];
			
			for(int j = 0; j < 4; j++) {
				cnt[j] = c / coin[j];
				c %= coin[j];
			}
			System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3]);

		}

	}

}
