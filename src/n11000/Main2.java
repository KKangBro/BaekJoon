package n11000; // 강의실 배정

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
	static class Lecture implements Comparable<Lecture> {
		int start;
		int end;

		public Lecture(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Lecture other) {
			if (this.start != other.start)
				return this.start - other.start;
			else {
				return this.end - other.end;
			}
		}
	}
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static String src = """
			3
			2 4
			1 3
			3 5
			"""; // output : 2

	public static void main(String[] args) throws Exception {
		input = new BufferedReader(new StringReader(src));

		int N = Integer.parseInt(input.readLine());
		Lecture[] arr = new Lecture[N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(input.readLine());
			arr[i] = new Lecture(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(arr);

		List<Integer> list = new ArrayList<>();
		for (Lecture lec : arr) {
//			System.out.println(lec);

			boolean checkAdd = true;
			for (Integer end : list) {
//				System.out.println(end);
				if (lec.start >= end) {
					list.remove(Integer.valueOf(end));
					list.add(lec.end);
//					System.out.println(list);
					checkAdd = false;
					break;
				}
			}

			if (checkAdd) {
				list.add(lec.end);
//				System.out.println(list);
			}
		}
		System.out.println(list.size());
	}
}