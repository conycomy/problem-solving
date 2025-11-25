import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<Integer, String> pokemonBible = new HashMap<>();
        HashMap<String, Integer> oppositeBible = new HashMap<>();

        sc.nextLine();

        for(int i = 1; i <= N; i++) {
            String name = sc.nextLine();

            pokemonBible.put(i, name);
            oppositeBible.put(name, i);
        }

        for(int i = 0; i < M; i++){
            String question = sc.nextLine();

            try {
                int num = Integer.parseInt(question);
                System.out.println(pokemonBible.get(num));
            } catch(NumberFormatException e){
                System.out.println(oppositeBible.get(question));
            }
        }

    }
}
