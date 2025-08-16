import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {                // 줄
			for (int s = 1; s <= n - i; s++) {        // 공백
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {            // 별
				System.out.print("*");
			}
			System.out.println();                     // 줄바꿈
		}
	}
}