package n10448; // 유레카 이론

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			10
			20
			1000
			"""; // output: 1 0 1

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int[] triNum = new int[45];
		for (int i = 1; i <= triNum.length; i++) {
			triNum[i - 1] = i * (i + 1) / 2;
			System.out.println((i-1) + ": " + triNum[i-1]);
		}
		System.out.println(Arrays.toString(triNum));

		int T = Integer.parseInt(input.readLine());
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(input.readLine());
			System.out.println(K);
			
		}
		
		//만약 K가 정확히 3개의 삼각수의 합으로 표현될수 있다면 1을, 그렇지 않다면 0을 출력한다.
	}

}
