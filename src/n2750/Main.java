package n2750; // 수 정렬하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			5
			2
			3
			4
			1
			"""; // output: 1 2 3 4 5

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(input.readLine());

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(input.readLine()));
		}
		Collections.sort(list);

		for (Integer i : list) {
			output.append(i + "\n");
		}

		System.out.println(output);
	}

}
