import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        long result = 0;
        long power = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }

            result += value * power;
            power *= B;
        }

        System.out.println(result);
    }
}