
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int[] arr = new int[10];
		int idx = 0;
		for(int i = 1; i <= 9; i++){
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
