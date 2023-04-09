package n1783; // 병든 나이트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			100 50
			"""; // output : 48

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int rst = 0;
		if (N == 1) {
			rst = 1;
		} else if (N == 2) {
			rst = (M + 1) / 2;
			rst = rst > 4 ? 4 : rst;
		} else {
			if (M <= 4) {
				rst = M;
			} else if (M == 5 || M == 6) {
				rst = 4;
			} else {
				rst = M - 2;
			}
		}

		System.out.println(rst);
	}

}
