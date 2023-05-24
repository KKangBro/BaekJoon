package n9012; // 괄호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			((
			))
			())(()
			"""; // output: NO NO YES NO YES NO

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		Stack<Character> stack = new Stack<>();
		boolean check = false;

		int T = Integer.parseInt(input.readLine());
		for (int i = 0; i < T; i++) {
			stack.clear();
			check = false;
			String str = input.readLine();

			for (char c : str.toCharArray()) {
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.empty()) {
						stack.push(c);
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (stack.empty())
				check = true;

			output.append(check ? "YES\n" : "NO\n");
		}

		System.out.println(output);
	}
}