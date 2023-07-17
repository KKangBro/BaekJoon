package n1713; // 후보 추천하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			8
			1 1 2 2 3 3 3 4
			"""; // output: 2 6 7

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		int R = Integer.parseInt(input.readLine());

		Queue<Integer> queue = new LinkedList<>();
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int min = 0;
		StringTokenizer st = new StringTokenizer(input.readLine());
		for (int i = 0; i < R; i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println("\nnum: " + num);

			if (!queue.contains(num)) {
				if (queue.size() < N) {
					queue.add(num);
				} else {
					for (Integer q : queue) {
						if (hmap.get(q) == min) {
							queue.remove(q);
							hmap.remove(q);
							break;
						}
					}

					queue.add(num);
				}
			}
			hmap.put(num, hmap.getOrDefault(num, 0) + 1);

			min = Collections.min(hmap.values());
			System.out.println("min: " + min);

			System.out.println(hmap);
			System.out.println(queue);
		}

		ArrayList<Integer> list = new ArrayList<>(queue);
		Collections.sort(list);

		for (Integer i : list)
			output.append(i).append(" ");

		System.out.println(output);
	}

}
