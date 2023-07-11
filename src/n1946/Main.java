package n1946; // 신입 사원

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
			int[][] arr = new int[N][2];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(input.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr, (o1, o2) -> {
				return o1[0] - o2[0];
			});

			int answer = 1;
			int rank = arr[0][1];
			for (int i = 1; i < N; i++) {
				if (arr[i][1] < rank) {
					rank = arr[i][1];
					answer += 1;
				}
			}
			output.append(answer).append("\n");
		}
		
		System.out.println(output);
	}
}
