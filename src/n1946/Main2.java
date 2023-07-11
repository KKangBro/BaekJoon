package n1946; // 신입 사원

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			2
			5
			3 2
			1 4
			4 1
			2 3
			5 5
			7
			3 6
			7 3
			4 2
			1 4
			5 7
			2 5
			6 1
			"""; // output: 4 3

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int T = Integer.parseInt(input.readLine());
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(input.readLine());
			HashMap<Integer, Integer> hmap = new HashMap<>();
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(input.readLine());
				hmap.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}

			int answer = N;
			for (Integer key : hmap.keySet()) {
				if (out(hmap, key)) {
					answer -= 1;
				}
			}

			output.append(answer).append("\n");
		}
		System.out.println(output);
	}

	private static boolean out(HashMap<Integer, Integer> hmap, Integer key) {
		for (int i = key - 1; i >= 1; i--) {
			if (hmap.get(key) > hmap.get(i))
				return true;
		}
		return false;
	}

}
