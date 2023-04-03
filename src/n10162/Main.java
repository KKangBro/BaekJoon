package n10162; // 전자레인지

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			189
			"""; // output: 0 1 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int T = Integer.parseInt(input.readLine());
		// 5분, 1분, 10초
		int[] time = { 5 * 60, 60, 10 };
		int[] rst = new int[3];
		
		for (int i = 0; i < time.length; i++) {
			rst[i] = T / time[i];
			T = T % time[i];
		}

		if(T==0) {
			for (int i : rst) {
				output.append(i+" ");
			}
		} else {
			output.append(-1);
		}
		
		System.out.println(output);
	}

}
