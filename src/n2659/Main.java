package n2659; // 십자카드 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			2 1 1 2
			"""; // output: 10

	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new StringReader(src));

		String str = input.readLine().replaceAll(" ", "");
		int target = getClockNum(str);

		int count = 0;
		for (int num = 1111; num <= 9999; num++) {
			if ((num + "").contains("0"))
				continue;
			
			if (getClockNum(num + "") != num) // 시계수 체크 해줘야함.
				continue;

//			System.out.println(getClockNum(num + ""));
//			System.out.println(num);
//			System.out.println("---------");

			count += 1;

			if (num == target)
				break;
		}

		System.out.println(count);
	}

	private static int getClockNum(String str) {
		ArrayList<Integer> inputList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			char c = str.charAt(0);
			str = str.substring(1, 4) + c;
			inputList.add(Integer.parseInt(str));
		}

		Collections.sort(inputList);
		return inputList.get(0);
	}
}
