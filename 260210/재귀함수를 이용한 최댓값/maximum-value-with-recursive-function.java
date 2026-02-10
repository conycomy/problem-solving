import java.util.Scanner;
public class Main {

    public static int maxNum(int[] arr, int i) {


    if(i == arr.length){
        return Integer.MIN_VALUE;
    }

    int nextMax = maxNum(arr, i + 1);
    return Math.max(arr[i] , nextMax);

    }

    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxNum(arr, 0));
        
    }
}
