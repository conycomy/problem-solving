
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        ArrayList<Integer> primes = getList(N);

        for(int a : primes) {
            if ( a >= M ){
                System.out.println(a);
            }
        }
    }

    //true -> 소수 후보 / 살아남음
    //false -> 소수 아님 / 제거됨.

    private static ArrayList<Integer> getList(int N) {
        boolean[] isPrime = new boolean[N + 1];
        for(int i = 2; i <= N; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i <= N; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= N; j += i ){
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= N; i++) {
            if(isPrime[i]){
                list.add(i);
            }
        }

        return list;

    }


}
