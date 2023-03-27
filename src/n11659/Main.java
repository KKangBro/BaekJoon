package n11659;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
//	static String src = """
//			5 3
//			5 4 3 2 1
//			1 3
//			2 4
//			5 5
//			"""; // output: 12 9 1

	public static void main(String[] args) throws Exception {
//		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n + 1];
		st = new StringTokenizer(input.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int tc = 0; tc < m; tc++) {
			st = new StringTokenizer(input.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			output.append(arr[j] - arr[i - 1] + "\n");
		}

		System.out.println(output);
	}

}
