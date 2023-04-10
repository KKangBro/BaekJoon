package n2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			6243
			"""; // output: 198

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		String str = input.readLine();
		int N = Integer.parseInt(str); // N = 101 * x + 11 * y + 2 * z;
		int[] arr = new int[str.length()];
		System.out.println(Arrays.toString(arr));

		
		while (arr[0] < 10) {
			while (arr[1] < 10) {
				while (arr[2] < 10) {
//					System.out.println(x + " " + y + " " + z);
					int answer = 101 * x + 11 * y + 2 * z;
//					System.out.println(answer);
					if (answer == N) {
						System.out.println(100 * x + 10 * y + 1 * z);
						return;
					}
					arr[2]++;
				}
				arr[1]++;
			}
			arr[0]++;
		}
		System.out.println(0);
	}

}
