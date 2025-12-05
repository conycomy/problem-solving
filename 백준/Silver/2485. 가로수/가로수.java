
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < N; i++){
            list.add(arr[i]-arr[i-1]);
        }

        int totalGCD = list.get(0);

        for(int i = 1; i < list.size(); i++){
            totalGCD = plantMinTreeDistance(totalGCD, list.get(i));
        }

        int count = 0;
        for(int a : list) {
            count += (a / totalGCD) -1;
        }

        System.out.println(count);





    }

    private static int plantMinTreeDistance(int a, int b) {
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }


}
