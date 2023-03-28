package n1940; // 주몽

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			6
			9
			2 7 4 1 5 3
			"""; // output: 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(input.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(input.readLine());
		int m = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(input.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		int left = 0, right = 1, rst = 0;
		while (left < list.size()) {
			if (right == list.size()) {
				left++;
				right = left + 1;
			} else {
				int n1 = list.get(left);
				int n2 = list.get(right);

				if (n1 + n2 == m) {
					rst++;
					list.remove(Integer.valueOf(n1));
					list.remove(Integer.valueOf(n2));
					left = 0;
					right = 1;
				} else {
					right++;
				}
			}
		}

		System.out.println(rst);
	}

}
