package n10828; // 스택

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			14
			push 1
			push 2
			top
			size
			empty
			pop
			pop
			pop
			size
			empty
			pop
			push 3
			empty
			top
			"""; // output: 2 2 0 2 1 -1 0 1 -1 0 3

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			String[] str = input.readLine().split(" ");
			switch (str[0]) {
			case "push":
				stack.push(Integer.parseInt(str[1]));
				break;
			case "pop":
				if (!stack.empty())
					output.append(stack.pop() + "\n");
				else
					output.append("-1\n");
				break;
			case "size":
				output.append(stack.size() + "\n");
				break;
			case "empty":
				if (!stack.empty())
					output.append("0\n");
				else
					output.append("1\n");
				break;
			case "top":
				if (!stack.empty())
					output.append(stack.peek() + "\n");
				else
					output.append("-1\n");
				break;
			}
		}

		System.out.println(output);
	}
}
