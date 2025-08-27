
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String S = input.nextLine();
		int i = input.nextInt();

		System.out.println(S.charAt(i - 1));  // 인덱스 보정

	}
}
