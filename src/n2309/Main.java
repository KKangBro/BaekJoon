package n2309;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			20
			7
			23
			19
			10
			15
			25
			8
			13
			"""; // output: 7	8	10	13	19	20	23

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(input.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);

		int diff = sum - 100;
		int out1 = 0;
		int out2 = 0;
		out:
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if(arr[i]+arr[j] == diff) {
					out1 = arr[i];
					out2 = arr[j];
					break out;
				}
			}
		}
		
		for (int i : arr) {
			if(i == out1 || i == out2)
				continue;
			
			output.append(i+"\n");
		}
		
		System.out.println(output);
	}
}