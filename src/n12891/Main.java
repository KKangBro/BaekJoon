package n12891; // DNA 비밀번호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			4 2
			GATA
			1 0 0 1
			"""; // output: 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());

		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		String inputStr = input.readLine();
		st = new StringTokenizer(input.readLine());
		int[] arr = new int[4]; // A C G T
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < S - P + 1; i++) {
			String pw = inputStr.substring(i, i + P);
			int[] check = arr.clone();
			
			for (int j = 0; j < pw.length(); j++) {
				
			}
		}

	}

}
