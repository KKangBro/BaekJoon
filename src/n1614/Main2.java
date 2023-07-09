package n1614; // 영식이의 손가락

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			973
			"""; // output: 15

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int hurt = Integer.parseInt(input.readLine());
		int count = Integer.parseInt(input.readLine());

		int flag = -1;
		int now = 1;
		int answer = 0;
		while (true) {
			answer += 1;

			if (now == 1 || now == 5)
				flag *= -1;

			now += flag;

			if (now == hurt) {
				count -= 1;
				if (count == -1)
					break;
			}

		}

		System.out.println(answer);
	}
}
