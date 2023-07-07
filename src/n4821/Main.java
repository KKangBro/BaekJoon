package n4821; // 페이지 세기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			30
			31,10-15,25-28,8-4,13-20,9,8-8
			0
			"""; // output: 17 12

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		while (true) {
			int total = Integer.parseInt(input.readLine());
			if (total == 0)
				break;

			String[] ranges = input.readLine().split(",");
			Boolean[] pages = new Boolean[total + 1];

			for (String range : ranges) {
				if (!range.contains("-")) {
					int page = Integer.parseInt(range);
					if (page > total)
						continue;

					pages[page] = true;
					continue;
				}

				String[] page = range.split("-");
				int low = Integer.parseInt(page[0]);
				int high = Integer.parseInt(page[1]) > total ? total : Integer.parseInt(page[1]);

				if (low > total || low > high)
					continue;

				System.out.println(low + " ~ " + high);

				for (int i = low; i <= high; i++)
					pages[i] = true;

			}
			output.append(Collections.frequency(Arrays.asList(pages), true)).append("\n");
		}

		System.out.println(output);
	}
}
