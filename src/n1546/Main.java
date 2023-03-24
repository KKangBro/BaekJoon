package n1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4
			1 100 100 100
			""";
//	output	75.0

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		int n = Integer.parseInt(input.readLine());

		StringTokenizer st = new StringTokenizer(input.readLine());
		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		double max = Arrays.stream(arr).max().getAsDouble();
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / max * 100;
		}

		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);

	}

}
