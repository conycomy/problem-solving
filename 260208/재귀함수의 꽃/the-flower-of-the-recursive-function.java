import java.util.Scanner;
public class Main {

    public static void updown(int n){
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        updown(n-1);
        System.out.print(n + " ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        updown(n);

    }
}