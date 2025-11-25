import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        sc.nextLine();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String status = sc.next();

            map.put(name, status);
        }

        ArrayList<String> result = new ArrayList<>();

       for(String key : map.keySet()){
           if(map.get(key).equals("enter")){
               result.add(key);
           }
       }

        Collections.sort(result, Collections.reverseOrder());

        for(String name : result){
            System.out.println(name);
        }



    }

}
