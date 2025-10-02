import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    
        Scanner scan = new Scanner(System.in);
        Deque<Integer> dq = new LinkedList<>();
        int cardN = scan.nextInt();
     
        for(int i = 1; i <= cardN; i++) {
            dq.addLast(i); 
        }

        while(dq.size() > 1) { 
            
            dq.removeFirst(); 

            int movedCard = dq.removeFirst();
            dq.addLast(movedCard);      
        }

       
        if (!dq.isEmpty()) {
            System.out.println(dq.poll());
        }
        
        scan.close();
    }
}