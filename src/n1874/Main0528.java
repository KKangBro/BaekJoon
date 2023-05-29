package n1874; //스택 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main0528 {
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
			"""; // output: + + + + - - + + - + + - - - - -

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int n = Integer.parseInt(input.readLine());
		Stack<Integer> stack = new Stack<>();

		int target, num = 1;
		for (int i = 0; i < n; i++) {
			target = Integer.parseInt(input.readLine());

			while (num <= target) {
				stack.push(num);
				num += 1;
				output.append("+\n");
			}

			if (stack.peek() == target) {
				stack.pop();
				output.append("-\n");
			}
		}

		if (stack.isEmpty())
			System.out.print(output);
		else
			System.out.println("NO");
	}
}