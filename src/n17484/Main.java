package n17484; // 진우의 달 여행 (Small)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			6 4
			5 8 5 1
			3 5 8 4
			9 77 65 5
			2 1 5 2
			5 98 1 5
			4 95 67 58
			"""; // output: 29
	static int N, M;
	static int[][] map;
	static int[] dir = { -1, 0, 1 };

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		int rst = Integer.MAX_VALUE;
		for (int j = 0; j < M; j++) {
			rst = Math.min(rst, run(0, j, -1));
		}

		System.out.println(rst);
	}

	private static int run(int i, int j, int d) {
		if (i == N)
			return 0;

		int ret = Integer.MAX_VALUE;
		for (int c = 0; c < 3; c++) {
			if (c == d)
				continue;
			if (j + dir[c] < 0 || j + dir[c] >= M)
				continue;

			ret = Math.min(ret, run(i + 1, j + dir[c], c)) + map[i][j];
		}

		return ret;
	}

}
