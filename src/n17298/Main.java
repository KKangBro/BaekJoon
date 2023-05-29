package n17298; // 오큰수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4
			3 5 2 7
			"""; // output: 5 7 7 -1

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		int[] arr = new int[N];
		int[] rst = new int[N];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < N - 1; i++) {
			queue.clear();
			for (int j = i + 1; j < N; j++) {
				if (arr[i] < arr[j])
					queue.offer(arr[j]);
			}

			rst[i] = queue.isEmpty() ? -1 : queue.poll();
		}
		rst[N - 1] = -1;

		for (int i : rst)
			output.append(i + " ");
		System.out.println(output);
	}
}