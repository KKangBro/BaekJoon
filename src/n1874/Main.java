package n1874; // 스택 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			1
			2
			5
			3
			4
			""";

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int n = Integer.parseInt(input.readLine());
		Stack<Integer> stack = new Stack<>();
		int target;
		int num = 1;

		for (int i = 0; i < n; i++) {
			target = Integer.parseInt(input.readLine());

			while (num <= target) {
				stack.push(num);
				output.append("+\n");
				num++;
			}

			if (stack.peek() == target) {
				stack.pop();
				output.append("-\n");
			}
		}

		if (stack.empty()) {
			System.out.println(output);
		} else {
			System.out.println("NO");
		}
	}

}
