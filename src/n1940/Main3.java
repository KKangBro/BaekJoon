package n1940; // 주몽

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main3 {
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

		int rst = 0;
		while (list.size() > 1) {
			System.out.println(list);
			int num = list.get(0);
			int target = m - num;

			if (list.contains(target)) {
				System.out.println(num + ", " + target + "  matched!");
				rst++;
				list.remove(Integer.valueOf(target));
			}
			list.remove(Integer.valueOf(num));
		}
		
		System.out.println(rst);
	}

}
