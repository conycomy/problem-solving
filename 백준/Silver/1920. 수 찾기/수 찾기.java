
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//1. N개의 수를 HashSet에 저장!
		int N = in.nextInt();
		HashSet<Integer> setN = new HashSet<>();

		for(int i = 0; i < N; i++) {
			int value = in.nextInt();
			setN.add(value);
		}

		int M = in.nextInt();
		HashSet<Integer> setM = new HashSet<>();
		for(int i = 0; i < M; i++) {
			int point = in.nextInt();
			if(setN.contains(point)) {
				System.out.println(1);
			} else 
				System.out.println(0);
		}
		}
	}


	/*public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // N 입력
		int[] numN = new int[N]; // N개의 수만큼 배열 크기 선언

		// nums에 값 넣기
		for (int i = 0; i < N; i++) {
			numN[i] = in.nextInt();
		}

		int M = in.nextInt(); // M 입력
		int[] numM = new int[M]; // M개의 수만큼 배열 크기 선언

		for (int i = 0; i < M; i++) {
			numM[i] = in.nextInt(); // 값 넣는당
		}

		boolean found = false;
		for (int i = 0; i < numM.length; i++) {
			for (int j = 0; j < numN.length; j++) {
				if (numM[i] == numN[j]) {
					found = true;
				}
			}

			if (found) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}



		*//*for(int i = 0; i< numN.length; i++) {
			for(int j = 0; j < numM.length; j++ ) {
				if(numN[i] == numM[j]) {
					numM[j] = 1;
					System.out.println("같은 값 찾음: " + numN[i]);
				} else if (numN[i] != numM[j]) {
					numM[j] = 0;
					System.out.println("다른 값 찾음: " + numN[i] + "이랑 " + numM[j]);
				}
				System.out.println(numM[j]);

			}
		}*//*
	}*/


