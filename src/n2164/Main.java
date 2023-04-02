package n2164; // 카드2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			6
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		int cnt = 1;
		while (queue.size() > 1) {
			if (cnt % 2 == 1) {
				queue.poll();
			} else {
				queue.add(queue.poll());
			}

			cnt++;
		}

		System.out.println(queue.poll());
	}

}
