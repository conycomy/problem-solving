import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력 받음.
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
            set.add(value);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}


        
    
