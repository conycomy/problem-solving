import java.util.Scanner;

public class Main {

    static final char PUSH = '(';
    static final char POP = ')';
    static final int ANSWER = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // true -> VPS 조건에 맞아용
        // false -> VPS 조건에 맞지 않아용

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            boolean isValid = false;
            int vps = 0; // 지금까지 처리한 모든 문자의 결과 요약

            // 변수는 언제 바뀜?
            // 잘못된 상태를 즉시 감지함?
            // 그 상태를 계속 유지?

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c == PUSH) {
                    ++vps;
                } else if (c == POP)
                    --vps;
                if (vps < ANSWER) {
                    break;
                }
            }
            if (vps == ANSWER) {
                isValid = true;
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }

        }

    }
}


