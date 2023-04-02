package n12891; // DNA 비밀번호

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	static StringBuilder output = new StringBuilder();
	static String src = """
			9 8
			CCTGGATTG
			2 0 1 1
			"""; // output: 0
	static int[] myArr;
	static int[] checkArr;
	static int pass;

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		StringTokenizer st = new StringTokenizer(input.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		String inputStr = input.readLine();
		st = new StringTokenizer(input.readLine());
		myArr = new int[4]; // A C G T
		checkArr = new int[4]; // A C G T
		pass = 0;
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0)
				pass++;
		}

		int rst = 0;
		for (int i = 0; i < P; i++) {
			add(inputStr.charAt(i));
		}

		if (pass == 4)
			rst++;

		for (int i = P; i < S; i++) {
			add(inputStr.charAt(i));
			remove(inputStr.charAt(i - P));
			
			if (pass == 4)
				rst++;
		}

		System.out.println(rst);
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				pass--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				pass--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				pass--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				pass--;
			myArr[3]--;
			break;
		}
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				pass++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				pass++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				pass++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				pass++;
			break;
		}
	}

}
