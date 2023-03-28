package n11050; // 이항 계수 1

// https://ko.wikipedia.org/wiki/%EC%9D%B4%ED%95%AD_%EA%B3%84%EC%88%98
// C(n, k) = n!/(k!(n-k)!) (0 <= k <= n)
// 참고: https://st-lab.tistory.com/159

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static String src = """
			5 2
			"""; // output: 10

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
	}

	private static int factorial(int n) {
		if (n <= 1)
			return 1;

		return n * factorial(n - 1);
	}

}
