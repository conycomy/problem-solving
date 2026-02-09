import java.util.Scanner;
public class Main {

    public static int SquareSum(int n){

        if(n == 0) {
            return 0;
        }
        int digit = n % 10;
        return digit * digit + SquareSum(n/10);
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(SquareSum(n));
    


    }
}