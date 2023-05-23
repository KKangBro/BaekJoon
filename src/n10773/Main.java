package n10773; // 제로

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static String src = """
//			10
//			1
//			3
//			5
//			4
//			0
//			0
//			7
//			0
//			0
//			6
//			"""; // output: 7

	public static void main(String[] args) throws Exception {
//		input = new BufferedReader(new StringReader(src));

		int K = Integer.parseInt(input.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(input.readLine());
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}

		int rst = 0;
		for (Integer i : stack)
			rst += i;
		System.out.println(rst);
	}
}