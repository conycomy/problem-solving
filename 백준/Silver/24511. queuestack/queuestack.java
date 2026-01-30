import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] determine = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            determine[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            if(determine[i]==0){
                dq.addFirst(a);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<m;i++){
            int x = Integer.parseInt(st.nextToken());
            dq.addLast(x);
            sb.append(dq.pollFirst()).append(" ");
        }

        System.out.println(sb);
    }
}