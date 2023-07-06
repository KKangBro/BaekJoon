package n2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			3 7
			15 7
			5 2
			"""; // output: 260

	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new StringReader(src));

		int n = Integer.parseInt(input.readLine());
		int[] maxXY = new int[2];
		int[][] position = new int[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			for (int j = 0; j < 2; j++) {
				position[i][j] = Integer.parseInt(st.nextToken());
				maxXY[j] = maxXY[j] < position[i][j] ? position[i][j] + 10 : maxXY[j] + 10;
			}
		}

		Boolean[][] graph = new Boolean[maxXY[1]][maxXY[0]];

		for (int i = 0; i < n; i++) {
			int x1 = position[i][0];
			int y1 = position[i][1];

			for (int x = x1; x < x1 + 10; x++) {
				for (int y = y1; y < y1 + 10; y++)
					graph[y][x] = true;
			}
		}

		int answer = 0;
		for (Boolean[] g : graph)
			answer += Collections.frequency(Arrays.asList(g), true);
		System.out.println(answer);
	}
}
