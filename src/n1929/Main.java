package n1929; // 소수구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
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

		for (int i = M; i <= N; i++) {
			if (isPrime(i))
				output.append(i + "\n");
		}

		System.out.println(output);
	}

	private static boolean isPrime(int num) {
		// 소수는 1과 N만을 약수로 가진다. 그럼 2부터 N-1까지의 수로는 나눠져서는 안된다.
		for (int j = 2; j < num; j++) {
			if (num % j == 0)
				return false;
		}
		return true;
	}

}
