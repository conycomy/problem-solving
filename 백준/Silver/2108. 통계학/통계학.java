
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println(arithmetic(numbers, N));
		System.out.println(median(numbers, N));
		System.out.println(mode(numbers, N));
		System.out.println(range(numbers, N));

	}

	// 산술 평균
	public static int arithmetic(int[] numbers, int N) {
		int arithmeticAnswer = 0;
		for (int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			arithmeticAnswer += temp;

		}
		return (int) Math.round((double) arithmeticAnswer / N);
	}

	// 중앙 값
	public static int median(int[] numbers, int N) {
		Arrays.sort(numbers);
		int medianAnswer = numbers[N / 2];
		return medianAnswer;
	}

	// 최빈 값
	public static int mode(int[] numbers, int N) {
		int[] count  = new int[8001];
		int maxCount = 0;

		Arrays.sort(numbers);
		for(int number : numbers) {
			int index = number + 4000;
			count[index]++;

			if(count[index] > maxCount) {
				maxCount = count[index];
			}
		}
		int modeValue = 0;
		boolean isFirstModeFound = false;

		for(int i = 0; i <= 8000; i++){
			if(count[i] == maxCount) {
				int currentNumber = i - 4000;
				
				if(!isFirstModeFound) {
					modeValue = currentNumber;
					isFirstModeFound = true;
				} else {
					modeValue = currentNumber;
					break;
				}
			}
		}
		return modeValue;
	}

	// 범위
	public static int range(int[] numbers, int N) {
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
			min = Math.min(min, numbers[i]);

		}
		return max - min;
	}


}
