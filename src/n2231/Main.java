package n2231; // 분해합

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			"""; // output: 198

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());

		for (int i = 1; i <= N; i++) {
			int sum = i;
			String str = Integer.toString(i);
			for (int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - '0';
			}
			
			if(sum == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

}
