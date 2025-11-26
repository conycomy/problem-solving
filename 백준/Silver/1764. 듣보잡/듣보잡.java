import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 듣도 보도 못한 사람
        int M = sc.nextInt(); // 보도 못한 사람
        sc.nextLine();

        HashMap<String, Integer> noListenSeeingPerson = new HashMap<>();

        for(int i = 0; i < N; i++){
            String noListenPerson = sc.next();

            noListenSeeingPerson.put( noListenPerson, i);
        }

        ArrayList<String> resultName = new ArrayList<>();

        for(int i = 0; i < M; i++){
            String noSeeingPerson = sc.next();

            if(noListenSeeingPerson.containsKey(noSeeingPerson)){
                resultName.add(noSeeingPerson);
            }
        }

        System.out.println(resultName.size());
        Collections.sort(resultName);

        for(String a : resultName){
            System.out.println(a);
        }

    }
}
