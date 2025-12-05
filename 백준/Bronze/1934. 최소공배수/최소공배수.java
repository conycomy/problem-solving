import java.util.Scanner;

public class Main {


    //최소 공배수 구하기
    public static int GCD(int a, int b){

            while(b != 0){
                int remainder  = a % b;
                a = b;
                b = remainder;
            }
        return a;
    }

    public static int LCM(int a, int b, int gcdValue) {

        return  a * b / gcdValue;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0;  i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int gcdValue = GCD(A,B);
            long lcmValue = LCM(A, B, gcdValue);

            System.out.println(lcmValue);
        }
    }



}
