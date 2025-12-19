import java.util.Scanner;
public class Main {

    private static int GCD(int a, int b){
        int tmp, n;

        if(a<b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while ( b!= 0 ) {
            n = a%b; 
            a = b;
            b= n;
        }
        return a;
        
    }
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int a = GCD(n , m);
    
    System.out.print(a);
    }
}