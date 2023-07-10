package n23814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			1 1 10
			"""; // output: 9
	static long D;
	static long maxMandu;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		D = Long.parseLong(input.readLine());
		Long[] menu = new Long[3];
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < 3; i++)
			menu[i] = Long.parseLong(st.nextToken());
		maxMandu = Arrays.asList(menu).stream().mapToLong(i -> i).sum() / D;

//		System.out.println(Arrays.toString(menu));
//		System.out.println("최대만두 " + maxMandu);

		Long answer = 0L;
		// case 1: K개 볶음밥 주문
		answer = answer > go(menu) ? answer : go(menu);

		// case 2: K에서 가져와서 N을 D의 배수로 만들기
		// case 3: K에서 가져와서 M을 D의 배수로 만들기
		for (int t = 0; t < 2; t++) {
			Long[] copy = Arrays.copyOf(menu, 3);
			long move = D - (copy[t] % D);
			copy[t] += move;
			copy[2] -= move;

			answer = answer > go(copy) ? answer : go(copy);
		}

		// case 4: K에서 가져와서 N과 M을 D의 배수로 만들기
		Long[] copy = Arrays.copyOf(menu, 3);
		for (int t = 0; t < 2; t++) {
			long move = D - (copy[t] % D);
			copy[t] += move;
			copy[2] -= move;
		}

		answer = answer > go(copy) ? answer : go(copy);
		
		System.out.println(answer);
	}

	private static Long go(Long[] arr) {
		int answer = 0;
		for (int i = 0; i < 3; i++)
			answer += arr[i] / D;

		if (answer == maxMandu)
			return arr[2];
		return 0L;
	}
}
