package n18258; // 큐2

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

		int N = Integer.parseInt(input.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			String order = st.nextToken();
			int num = 0;
			if (st.hasMoreTokens())
				num = Integer.parseInt(st.nextToken());

			switch (order) {
			case "push":
				dq.addLast(num);
				break;
			case "pop":
				output.append(dq.peekFirst() == null ? -1 : dq.pollFirst()).append("\n");
				break;
			case "size":
				output.append(dq.size()).append("\n");
				break;
			case "empty":
				output.append(dq.isEmpty() ? 1 : 0).append("\n");
				break;
			case "front":
				output.append(dq.peekFirst() == null ? -1 : dq.peekFirst()).append("\n");
				break;
			case "back":
				output.append(dq.peekLast() == null ? -1 : dq.peekLast()).append("\n");
				break;
			}
		}

		System.out.println(output);
	}
}