package n10448; // 유레카 이론

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			10
			20
			1000
			"""; // output: 1 0 1
	
	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int[] triNum = new int[44];
		for (int i = 1; i <= triNum.length; i++) {
			triNum[i - 1] = i * (i + 1) / 2;
		}

		int T = Integer.parseInt(input.readLine());
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(input.readLine());
			
			boolean isOk = false;
			out:
			for (int first : triNum) {
				for (int second : triNum) {
					for (int third : triNum) {
						if(first + second + third == K) {
							isOk = true;
							break out;
						}
					}
				}
			}
			
			System.out.println(isOk ? 1 : 0);
		}
	}
}