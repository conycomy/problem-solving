
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        ArrayDeque<Balloon> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= num; i++) {
            int move = Integer.parseInt(st.nextToken());
            dq.addLast(new Balloon(i, move));

        }

        StringBuilder sb = new StringBuilder();


        while(!dq.isEmpty()){
            Balloon current =dq.pollFirst();
            sb.append(current.idx).append(" ");

            if(dq.isEmpty())
                break;


            int move = current.move;

            if(move > 0){
                for(int i = 0; i < move -1; i ++){
                    dq.addLast(dq.pollFirst());
                }
            }else {
                for(int i = 0; i< Math.abs(move); i++){
                    dq.addFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}

class Balloon {
    public int idx;
    public int move;

    public Balloon(int idx, int move) {
        this.idx = idx;
        this.move = move;
    }
}











