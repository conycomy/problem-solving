import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> uniqueWords = new HashSet<>();
        
        
        for(int i = 0; i < N; i++){
            String str = sc.next();
            uniqueWords.add(str);
        }

        int count = 0;
        for(int i = 0; i < M; i++){
            String targetWord = sc.next();

            if(uniqueWords.contains(targetWord)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
