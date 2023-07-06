package n2669; // 직사각형 네개의 합집합의 면적 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			1 2 4 4
			2 3 5 7
			3 1 6 5
			7 3 8 6
			"""; // output: 26

	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new StringReader(src));

		int[] maxXY = new int[2];
		int[][] position = new int[4][4];

		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			for (int j = 0; j < 4; j++) {
				position[i][j] = Integer.parseInt(st.nextToken());
				if (j >= 2)
					maxXY[j - 2] = maxXY[j - 2] < position[i][j] ? position[i][j] : maxXY[j - 2];
			}
		}

		Boolean[][] graph = new Boolean[maxXY[1]][maxXY[0]];

		for (int i = 0; i < 4; i++) {
			int x1 = position[i][0];
			int y1 = position[i][1];
			int x2 = position[i][2];
			int y2 = position[i][3];

//			System.out.println("(" + x1 + ", " + y1 + ") (" + x2 + ", " + y2 + ")");

			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++)
					graph[y][x] = true;
			}
		}

		int answer = 0;
		for (Boolean[] g : graph)
			answer += Collections.frequency(Arrays.asList(g), true);
		System.out.println(answer);
	}
}
