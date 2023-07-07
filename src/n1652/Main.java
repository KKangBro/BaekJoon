package n1652; // 누울 자리를 찾아라

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			.....
			.....
			..X..
			.....
			.....
			"""; // output: 5 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int[] answer = new int[2];
		int N = Integer.parseInt(input.readLine());

		char[][] map = new char[N][N];

		for (int i = 0; i < N; i++) {
			String str = input.readLine();
			for (int j = 0; j < N; j++)
				map[i][j] = str.charAt(j);

			String[] arr = str.split("X");
			for (String temp : arr) {
				if (temp.contains(".."))
					answer[0] += 1;
			}

		}

		for (int j = 0; j < N; j++) {
			String str = "";
			for (int i = 0; i < N; i++)
				str += map[i][j];

			String[] arr = str.split("X");
			for (String temp : arr) {
				if (temp.contains(".."))
					answer[1] += 1;
			}
		}

		System.out.println(answer[0] + " " + answer[1]);
	}

}
