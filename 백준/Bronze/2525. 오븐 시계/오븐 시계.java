import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각 입력받기 (시, 분)
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 요리 시간 입력받기 (분 단위)
        int cookTime = sc.nextInt();

        // 전체 분으로 환산
        int totalMinute = hour * 60 + min + cookTime;

        // 시와 분으로 환산
        int newH = (totalMinute / 60) % 24;
        int newM = totalMinute % 60;

        System.out.println(newH + " " + newM);
    }
}