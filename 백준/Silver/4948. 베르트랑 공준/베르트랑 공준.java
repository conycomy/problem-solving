
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 246912;
        boolean[] isPrime = sieve(max);

        while (true) {
            int input = sc.nextInt();
            if (input == 0)
                break;

            int count = 0;
            for( int i = input + 1 ; i <= 2 * input; i++){
                if(isPrime[i]){
                    count++;
                }
            }

            System.out.println(count);


        }

    }


    private static boolean[] sieve (int max){
        boolean[] isPrime = new boolean[max+1];

        for(int i = 2; i <= max; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= max; i++) {
            if(isPrime[i]){
                for(int j = i * i; j <= max; j += i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}