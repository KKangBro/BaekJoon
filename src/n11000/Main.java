package n11000; // 강의실 배정

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
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
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(arr[0].end);
		for (int i = 1; i < N; i++) {
			if(pq.peek() <= arr[i].start) {
				pq.poll();
			}
			pq.offer(arr[i].end);
		}
		
		System.out.println(pq.size());
	}
}