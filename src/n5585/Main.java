package n5585;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			380
			"""; // output: 4

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int amount = 1000 - Integer.parseInt(input.readLine());
		int money = 1000; // 500엔, 100엔, 50엔, 10엔, 5엔, 1엔

		int rst = 0;
		for (int i = 1; i <= 6; i++) {
			if (amount == 0)
				break;

			if (i % 2 == 0)
				money /= 5;
			else
				money /= 2;
			
			rst += amount / money;
			amount %= money;
		}

		System.out.println(rst);
	}
}