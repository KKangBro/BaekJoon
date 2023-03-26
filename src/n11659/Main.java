package n11659;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5 3
			5 4 3 2 1
			1 3
			2 4
			5 5
			""";	// output: 12 9 1
	
	// https://hongjuzzang.github.io/cs/two_pointers/

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] numArr = new int[n];
		st = new StringTokenizer(input.readLine());
		for (int i = 0; i < n; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}

		for (int tc = 0; tc < m; tc++) {
			int sum = 0;
			st = new StringTokenizer(input.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			for (int k = i; k <= j; k++) {
				sum += numArr[k];
			}
			output.append(sum+"\n");
		}
		
		System.out.println(output);
	}

}
