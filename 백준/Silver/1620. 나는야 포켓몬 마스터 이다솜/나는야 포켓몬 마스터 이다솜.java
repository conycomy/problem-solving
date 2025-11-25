import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 포켓몬의 개수 N
        int M = sc.nextInt(); // 내가 맞춰야 하는 문제의 개수 M

        HashMap<Integer, String> pokemonBible = new HashMap<>();
        HashMap<String, Integer> oppositeBible = new HashMap<>();
        sc.nextLine();


        for(int i = 1; i <= N; i++){
            String name = sc.nextLine();
            pokemonBible.put(i, name);
            oppositeBible.put(name, i);
        }

        for(int i = 0; i < M; i++){
            String question = sc.nextLine();
            
            if(question.matches("\\d+")) {
                int num = Integer.parseInt(question);
                System.out.println(pokemonBible.get(num));
            } else {
                System.out.println(oppositeBible.get(question));
            }
        }


    }
}
