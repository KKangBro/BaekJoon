package n2564; // 경비원

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			10 5
			3
			1 4
			3 2
			2 8
			4 2
			"""; // output: 23

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int storeCnt = Integer.parseInt(input.readLine());
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < storeCnt; i++) {
			st = new StringTokenizer(input.readLine());
			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}
		st = new StringTokenizer(input.readLine());
		int[] me = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		int answer = 0;
		for (int[] store : list) {
			System.out.println(Arrays.toString(store));

			switch (me[0]) {
			case 1:
				if (store[0] == 1) {
					answer += Math.abs(store[1] - me[1]);
				} else if (store[0] == 2) {
					answer += y + Math.min(store[1] + me[1], 2 * x - (store[1] + me[1]));
				} else if (store[0] == 3) {
					answer += me[1] + store[1];
				} else if (store[0] == 4) {
					answer += x - me[1] + store[1];
				}
				break;
			case 2:
				if (store[0] == 1) {
					answer += y + Math.min(store[1] + me[1], 2 * x - (store[1] + me[1]));
				} else if (store[0] == 2) {
					answer += Math.abs(store[1] - me[1]);
				} else if (store[0] == 3) {
					answer += me[1] + y - store[1];
				} else if (store[0] == 4) {
					answer += x - me[1] + y - store[1];
				}
				break;
			case 3:
				if (store[0] == 1) {
					answer += me[1] + store[1];
				} else if (store[0] == 2) {
					answer += y - me[1] + store[1];
				} else if (store[0] == 3) {
					answer += Math.abs(store[1] - me[1]);
				} else if (store[0] == 4) {
					answer += x + Math.min(store[1] + me[1], 2 * y - (store[1] + me[1]));
				}
				break;
			case 4:
				if (store[0] == 1) {
					answer += me[1] + x - store[1];
				} else if (store[0] == 2) {
					answer += y - me[1] + x - store[1];
				} else if (store[0] == 3) {
					answer += x + Math.min(store[1] + me[1], 2 * y - (store[1] + me[1]));
				} else if (store[0] == 4) {
					answer += Math.abs(store[1] - me[1]);
				}
				break;
			}

			System.out.println(answer);
		}

		System.out.println(answer);
	}

}
