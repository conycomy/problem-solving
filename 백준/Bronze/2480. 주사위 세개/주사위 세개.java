import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    Map<Integer, Integer> count = new HashMap<>();

    count.put(a, count.getOrDefault(a,0) +1);
    count.put(b, count.getOrDefault(b,0) +1);
    count.put(c, count.getOrDefault(c,0) +1);

    int result = 0;

    for (int key : count.keySet()){
      int value = count.get(key);

      if(value == 3){
        result = 10000 + key * 1000;
        break;
      } else if (value == 2) {
        result = 1000 + key * 100;
        break;
      } 
    }

    if(result == 0){
        int max = Math.max(a, Math.max(b,c));
        result = max * 100;
      }


    System.out.println(result);
  }
}
