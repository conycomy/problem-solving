import java.io.*; // BufferedReader는 java.io 

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ❗ 괄호 닫기 누락

		// 한 줄 입력받음
		String line = br.readLine(); 

		// 공백으로 나눠줌
		String[] strNums = line.split(" ");

		// int형으로 바꾸기
		int h = Integer.parseInt(strNums[0]);
		int m = Integer.parseInt(strNums[1]);

		// 분 단위로 바꾸고 45분 빼기
		int totalMinutes = h * 60 + m - 45; 

		// 음수 보정
		if (totalMinutes < 0) {
			totalMinutes += 1440;
		}

		// 다시 시, 분으로 환산
		int newH = totalMinutes / 60;
		int newM = totalMinutes % 60;

		// 출력
		System.out.println(newH + " " + newM);
	}
}
