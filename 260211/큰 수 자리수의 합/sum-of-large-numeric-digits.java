import java.util.Scanner;
public class Main {

    public static int sum(int d) {
        
        if(d == 0){
            return 0;
        }

        return sum(d / 10) + d % 10;
    }



 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a * b * c; 
        
        System.out.print(sum(d));

        

    }
}