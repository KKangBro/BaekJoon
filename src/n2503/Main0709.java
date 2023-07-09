package n2503; // 숫자 야구

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main0709 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4
			123 1 1
			356 1 0
			327 2 0
			489 0 1
			"""; // output: 2
	static HashMap<Integer, int[]> hmap;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int q = Integer.parseInt(input.readLine());
		hmap = new HashMap<>();
		for (int i = 0; i < q; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			int key = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());

			if (s == 3) {
				System.out.println(1);
				return;
			}

			int b = Integer.parseInt(st.nextToken());
			hmap.put(key, new int[] { s, b });
		}

		int answer = 0;
		for (int num = 123; num <= 987; num++) {
			if ((num + "").contains("0"))
				continue;
			int h = num / 100;
			int t = (num % 100) / 10;
			int o = num % 10;
			if (h == t || t == o || h == o)
				continue;

			if (isAnswer(h, t, o))
				answer += 1;
		}

		System.out.println(answer);
	}

	private static boolean isAnswer(int h, int t, int o) {
		for (Integer key : hmap.keySet()) {
			int[] baseball = new int[2];
			int kh = key / 100;
			int kt = (key % 100) / 10;
			int ko = key % 10;

			if (h == kh)
				baseball[0] += 1;
			if (t == kt)
				baseball[0] += 1;
			if (o == ko)
				baseball[0] += 1;

			if (h == kt || h == ko)
				baseball[1] += 1;
			if (t == kh || t == ko)
				baseball[1] += 1;
			if (o == kh || o == kt)
				baseball[1] += 1;

			if (baseball[0] != hmap.get(key)[0] || baseball[1] != hmap.get(key)[1])
				return false;
		}

		return true;
	}
}
