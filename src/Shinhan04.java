import java.util.ArrayList;

public class Shinhan04 { // 놀이공원 티켓 판매하기
	public int solution(int tickets, int[][] requests) {
		int answer = 0;
		
		int sum = 0;
		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < requests.length; i++) {
			list.add(requests[i]);
			sum += requests[i][1];
		}
		
		if(tickets >= sum) return sum;
		
		list.sort((a,b) -> {
			int rst1 = a[0] - b[0];
			int rst2 = b[1] - a[1];
			if(rst1 == 0) return rst2;
			return rst1;
		});
		
		for (int[] req : list) {
//			System.out.println(req[0] +", "+ req[1] +" : "+ tickets);
			if(tickets >= req[1]) {
				tickets -= req[1];
				answer += req[1];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Shinhan04 T = new Shinhan04();

		System.out.println(T.solution(10, new int[][] { { 2, 3 }, { 1, 7 }, { 2, 4 }, { 3, 5 } }));
		System.out.println(T.solution(8, new int[][] { { 1, 9 }, { 3, 6 }, { 2, 5 } }));
		System.out.println(T.solution(20000, new int[][] { { 3, 1 }, { 2, 5 }, { 2, 10 }, { 3, 8 }, { 1, 2 } }));
	}
}
