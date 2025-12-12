
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for(int i = 0; i < T; i++){
            long N = sc.nextLong();

            if (N < 2) N = 2;

            while(!checkPrimeNumber(N)){
                N++;
            }
            System.out.println(N);
        }
    }

    public static boolean checkPrimeNumber(long targetNumber){
        if (targetNumber < 2) return false;

        for(long i = 2; i * i <= targetNumber; i++){
            if(targetNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}