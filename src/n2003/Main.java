package n2003;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			10 5
			1 2 3 4 2 5 3 1 1 2
			"""; // output: 3

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

		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));
		
		int left = 0;
		int right = 0;
		while(left <= m) {
			
		}
	}
}
