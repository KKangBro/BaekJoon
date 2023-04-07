package n10610; // 30

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			102
			"""; // output : 210

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));
		
		String N = input.readLine();
		Character[] arr = new Character[N.length()];
		
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}

}
