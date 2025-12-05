


import java.util.Scanner;

public class Main {

    private static int GCD(int a, int b) {
        while ( b != 0 ){
            int remainder= a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int gcdValue = GCD(A,B);
        long result = (long) A * B / gcdValue;
        
        System.out.println(result);

    }

  
}
