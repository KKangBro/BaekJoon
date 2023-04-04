package n13458; // 시험 감독

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			1000000 1000000 1000000 1000000 1000000
			5 7
			"""; // output: 7

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		int[] A = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(A));
		
		StringTokenizer st = new StringTokenizer(input.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int rst = N;
		for (int i = 0; i < N; i++) {
			A[i] -= B;
			
			if (A[i] > 0) {
				if (A[i] % C == 0) {
					rst = rst + (A[i] / C);
				} else {
					rst = rst + (A[i] / C) + 1;
				}
			}
		}

		System.out.println(rst);
	}
}
