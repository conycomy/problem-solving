import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		int count = 0;

		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}

		int s = sc.nextInt();
		for(int i = 0; i <arr.length; i++){
			if(arr[i] == s){
				count++;
			}
		}
		System.out.println(count);
	}

}
