package n1931; // 회의실 배정

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			11
			1 4
			3 5
			0 6
			5 7
			3 8
			5 9
			6 10
			8 11
			8 12
			2 13
			12 14
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		ArrayList<int[]> list = new ArrayList<>();

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		list.sort((a, b) -> {
			int order1 = a[1] - b[1]; // 종료 시간 순
			int order2 = a[0] - b[0]; // 시작 시간 순
			if (order1 == 0)
				return order2;
			return order1;
		});

//		for (int[] is : list)
//			System.out.println(Arrays.toString(is));

		int answer = 1;
		int end = list.get(0)[1];
		for (int i = 1; i < list.size(); i++) {
			int[] time = list.get(i);

			if (time[0] < end)
				continue;

			end = time[1];
			answer += 1;
		}

		System.out.println(answer);
	}
}
