import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static boolean binarySearch(int[] cards, int target){
        int start = 0;
        int end = cards.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (cards[mid] == target) {
                return true;
            } else if (cards[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];

        for(int i = 0; i < N; i++){
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);

        int M = sc.nextInt();
        int[] matchCards = new int[M];
        for(int i = 0; i < M; i++){
            matchCards[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++) {
            System.out.print((binarySearch(cards, matchCards[i]) ? 1 : 0) + " ");
        }


        /*for(int i = 0; i < M; i++){
            int result = 0;
            for(int j = 0; j < N; j++){
                if(matchCards[i] == cards[j]){
                    result = 1;
                    break;
                }
            }
            System.out.print(result + " ");
        }*/
    }


}
