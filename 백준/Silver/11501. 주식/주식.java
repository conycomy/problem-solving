
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) { // 테스트 케이스의 수
            int day = sc.nextInt();
            int[] price = new int[day];

            for (int j = 0; j < day; j++) {
                price[j] = sc.nextInt();
            }

            long realBenefit = 0;
            int Max = price[price.length - 1];

            for (int index = price.length - 2; 0 <= index; index--) {


                if (Max > price[index]) {
                    realBenefit += Max - price[index];

                } else {
                    Max = price[index];

                }


            }
            System.out.println(realBenefit);
        }

    }

}








