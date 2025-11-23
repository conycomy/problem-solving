import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] cards = new int[N];

        for(int i = 0; i < N; i++){
            cards[i] = sc.nextInt();
        }

        int Max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                int middlePlus = 0;
                if( cards[i] + cards[j] < M ) {
                     middlePlus = cards[i] + cards[j];
                }
                for(int plus = j+1; plus < N; plus++) {
                    int result = middlePlus + cards[plus];
                        if (result <= M) {
                            if (Max < result) {
                                Max = result;
                            }
                        }
                    }
                }
            }

        System.out.print(Max);
        }
    }

