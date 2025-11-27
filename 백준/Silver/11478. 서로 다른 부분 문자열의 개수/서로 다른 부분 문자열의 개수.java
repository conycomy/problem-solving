
import java.util.HashSet;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        //ArrayList<String> result = new ArrayList<>();
        HashSet<String> result = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= str.length() - (i + 1); j++) {

                result.add(str.substring(j, j+i+1));
            }
        }

        System.out.println(result.size());
    }

}
