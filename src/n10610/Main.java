package n10610; // 30

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			102
			"""; // output : 210

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		String N = input.readLine();
		int sum = 0;
		int[] cnt = new int[10];
		for (int i = 0; i < N.length(); i++) {
			int temp = N.charAt(i) - '0';
			sum += temp;
			cnt[temp] += 1;
		}

		if (cnt[0] == 0 || sum % 3 != 0) {
			output.append("-1");
		} else {
			int length = 0;
			out:
			for (int j = 9; j >= 0; j--) {
				while (cnt[j] > 0) {
					output.append(j);
					length++;

					if (length == N.length())
						break out;

					cnt[j] -= 1;
				}
			}
		}

		System.out.println(output);
	}

}
