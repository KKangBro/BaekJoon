package n10845; // 큐

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			15
			push 1
			push 2
			front
			back
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
			front
			"""; // output: 1 2 2 0 1 2 -1 0 1 -1 0 3

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		Deque<Integer> queue = new ArrayDeque<>();
		int N = Integer.parseInt(input.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());

			String order = st.nextToken();
			Integer num = 0;
			if (st.hasMoreTokens())
				num = Integer.parseInt(st.nextToken());

			switch (order) {
			case "push":
				queue.offer(num);
				break;
			case "pop":
				num = queue.poll();
				output.append(num == null ? -1 : num).append("\n");
				break;
			case "size":
				output.append(queue.size()).append("\n");
				break;
			case "empty":
				output.append(queue.isEmpty() ? 1 : 0).append("\n");
				break;
			case "front":
				num = queue.peek();
				output.append(num == null ? -1 : num).append("\n");
				break;
			case "back":
				num = queue.peekLast();
				output.append(num == null ? -1 : num).append("\n");
				break;
			}
//			System.out.println(queue);
		}

		System.out.println(output);
	}
}