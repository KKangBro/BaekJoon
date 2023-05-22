package inflearn.ch05.n01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static String src = """
//			(()(()))(()
//			"""; // output: NO

	public static void main(String[] args) throws Exception {
//		input = new BufferedReader(new StringReader(src));

		String str = input.readLine();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case '(':
				stack.push(c);
				break;
			case ')':
				if (stack.empty()) {
					System.out.println("NO");
					return;
				} else {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						System.out.println("NO");
						return;
					}
				}
				break;
			}

		}
		
		if (stack.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
