import java.util.Scanner;

public class Main {

    public static int inputFraction(Scanner sc, int num){

        return sc.nextInt();
    }


    private static int getGCD(int up, int down) {
        while(down != 0){
            int temp = down;
            down = up % down;
            up = temp;
        }
        return up;
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = 2;

        int A = inputFraction(sc , num); // 분자
        int B = inputFraction(sc, num); // 분모

        int A2 = inputFraction(sc, num); // 분자
        int B2 = inputFraction(sc, num); // 분모

        int up = A * B2 + A2 * B;
        int down = B * B2;

        int gcd = getGCD(up, down);

        int resultUp = up / gcd;
        int resultDown = down / gcd;

        System.out.println(resultUp + " " + resultDown);





    }

}
