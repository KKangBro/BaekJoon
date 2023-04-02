package n1541; // 잃어버린 괄호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			55-50+40
			"""; // output: -35
	static Queue<Character> queue;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		String str = input.readLine();

		queue = new LinkedList<>();
		for (int i = 0; i < str.length(); i++)
			queue.offer(str.charAt(i));
		queue.offer('-');

//		System.out.println(queue);

		int rst = 0;
		String temp = "";
		while (!queue.isEmpty()) {
			char c = queue.poll();
			
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				rst += Integer.parseInt(temp);
				temp = "";

				if (c == '-') {
					temp = subLogic(temp, c);
				}
			}
		}
		System.out.println(rst);
	}

	private static String subLogic(String temp, char c) {
		int sub = 0;
		while (!queue.isEmpty()) {
			c = queue.peek() == '-' ? queue.peek() : queue.poll();

			if (Character.isDigit(c)) {
				temp += c;
			} else {
				sub += Integer.parseInt(temp);
				temp = "";

				if (c == '-') {
					temp = "" + (sub * -1);
					break;
				}
			}
		}

		return temp;
	}
}