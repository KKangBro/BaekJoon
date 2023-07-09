package n1614; // 영식이의 손가락

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			5
			973
			"""; // output: 15

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int hurt = Integer.parseInt(input.readLine());
		long count = Long.parseLong(input.readLine());
		long answer = 0;

		if (hurt == 1 || hurt == 5) {
			answer = hurt == 5 ? 4 : 0;
			answer += 8 * count;
		} else {
			answer = 4 * count;

			if (count % 2 == 0) { // 다친손가락 사용가능횟수가 짝수이면, 다음 손가락 세는 방향은 좌 -> 우
				answer += hurt - 1;
			} else { // 다친손가락 사용가능횟수가 홀수이면, 다음 손가락 세는 방향은 우 -> 좌
				answer += 5 - hurt;
			}
		}

		System.out.println(answer);
	}
}
