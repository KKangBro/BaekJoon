package n2003; // 수들의 합 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
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

//		System.out.println(Arrays.toString(numArr));

		int l = 0;
		int r = 0;
		long sum = 0;
		long rst = 0;

		while (l < n) {
			if (sum == m) {
				rst++;
			}

			if (sum >= m || r == n) {
				sum -= numArr[l];
				l++;
			} else {
				sum += numArr[r];
				r++;
			}
		}

		System.out.println(rst);

	}
}
