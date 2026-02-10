import java.util.Scanner;

public class Main {

  
  public static int even(int n) {
    if(n == 0) {
        return 0;
    }

    return n + even(n - 2);
    }

  

  public static int odd(int n) {

    if(n == (-1)) {
        return 0;
    }

        return n + odd(n - 2);
    }
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0) {
            System.out.print(even(n));
        } else{
            System.out.print(odd(n));
        }

        
    }

}