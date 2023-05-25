package n4949; // 균형잡힌 세상

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			So when I die (the [first] I will see in (heaven) is a score list).
			[ first in ] ( first out ).
			Half Moon tonight (At least it is better than no Moon at all].
			A rope may form )( a trail in a maze.
			Help( I[m being held prisoner in a fortune cookie factory)].
			([ (([( [ ] ) ( ) (( ))] )) ]).
			 .
			.
			"""; // output: yes yes no no no yes yes

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		Stack<Character> stack = new Stack<>();
		while (true) {
			stack.clear();
			String str = input.readLine();
			if (str.equals("."))
				break;

			boolean bool = true;
			for (char c : str.toCharArray()) {
				if (c == '(' || c == '[') {
					stack.push(c);
				} else if (c == ')' || c == ']') {
					if (stack.empty()) {
						bool = false;
						break;
					} else {
						char top = stack.peek();
						if ((top == '(' && c == ')') || (top == '[' && c == ']')) {
							stack.pop();
						} else {
							bool = false;
							break;
						}
					}
				}
			}

			if (bool && stack.empty())
				output.append("yes\n");
			else
				output.append("no\n");
		}
		System.out.print(output);
	}
}