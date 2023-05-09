package n11403; // 경로 찾기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			7
			0 0 0 1 0 0 0
			0 0 0 0 0 0 1
			0 0 0 0 0 0 0
			0 0 0 0 1 1 0
			1 0 0 0 0 0 0
			0 0 0 0 0 0 1
			0 0 1 0 0 0 0
			"""; // output: 1 1 1\n1 1 1\n1 1 1
	static int[][] map;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		map = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			for (int j = 0; j < N; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(i == k | j == k)
						continue;
					
					if(map[i][k] == 1 && map[k][j] == 1) {
						map[i][j] = 1;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				output.append(map[i][j]+" ");
			}
			output.append("\n");
		}
		System.out.println(output);
	}
}
