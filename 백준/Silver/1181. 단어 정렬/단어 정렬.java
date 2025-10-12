import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		//String[] arr = new String[N];
		Set<String> UniqueWords = new HashSet<>();


		for( int i = 0; i < N; i++ ) {
			UniqueWords.add(br.readLine());
		}

		String[] arr = new String[UniqueWords.size()];
		arr = UniqueWords.toArray(arr);
		int maxWordLength = 50;

		List<String>[] wordBuckets = new ArrayList[maxWordLength + 1];

		for (int i = 0; i < wordBuckets.length; i++) {
			wordBuckets[i] = new ArrayList<>();
		}

		for(String word : arr) {
			int length = word.length();
			wordBuckets[length].add(word);
		}

		StringBuilder sb = new StringBuilder();

		for(List<String> bucket : wordBuckets) {
			if(bucket.size() > 0){
				Collections.sort(bucket);
			}
            	for(String word : bucket) {
			sb.append(word).append("\n");
		}
		}
	

		bw.write(sb.toString());
		bw.flush();


	}
}
