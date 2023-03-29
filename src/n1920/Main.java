package n1920; // 수 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			4 1 5 2 3
			5
			1 3 7 9 5
			"""; // output: 1 1 0 0 1

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		System.out.println(list);

		int M = Integer.parseInt(input.readLine());
		st = new StringTokenizer(input.readLine());
		for (int i = 0; i < M; i++) {
			if (list.contains(Integer.parseInt(st.nextToken()))) {
				output.append(1 + "\n");
			} else {
				output.append(0 + "\n");
			}
		}

		System.out.println(output);
	}

}
