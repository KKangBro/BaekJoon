package n1929; // 소수구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3 16
			"""; // output: 3 5 7 11 13

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] isPrimeArr = new boolean[N + 1];
		Arrays.fill(isPrimeArr, true);
		isPrimeArr[0] = isPrimeArr[1] = false;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if(!isPrimeArr[i]) continue;
			
			int j = 2;
			while (i * j < N + 1) {
				isPrimeArr[i * j] = false;
				j++;
			}

		}

		for (int i = M; i <= N; i++) {
			if (isPrimeArr[i])
				output.append(i + "\n");
		}

		System.out.print(output);
	}

}
