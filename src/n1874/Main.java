package n1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			8
			4
			3
			6
			8
			7
			5
			2
			1
			""";

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int n = Integer.parseInt(input.readLine());

		String str = "";
		for (int i = 0; i < n; i++) {
			str += input.readLine();
		}

		Stack<Integer> stack = new Stack<>();
		int idx = 0;
		for (int i = 1; i <= n; i++) {
			if(i == str.charAt(idx) - '0') {
				
				
			}
		}
		
	}

}
