package n11726; // 2×n 타일링

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			9
			"""; // output: 55

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int n = Integer.parseInt(input.readLine());
		int[] dp = new int[1001];

		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < n + 1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}

		System.out.println(dp[n]);
	}

}
