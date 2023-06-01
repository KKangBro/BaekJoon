package javaLoveClub.ch1.p6_과일가져가기;

public class Solution {

	public int solution(int[][] fruit) {
		int answer = 0;

		int row = fruit.length;
		int col = fruit[0].length;
		
		int[][] rank = new int[row][col]; 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(T.solution(
				new int[][] { 
					{ 10, 20, 30 }, 
					{ 12, 15, 20 }, 
					{ 20, 12, 15 }, 
					{ 15, 20, 10 }, 
					{ 10, 15, 10 } }));
//		System.out.println(T.solution(new int[][] { { 10, 9, 11 }, { 15, 20, 25 } }));
//		System.out.println(T.solution(
//				new int[][] { { 0, 3, 27 }, { 20, 5, 5 }, { 19, 5, 6 }, { 10, 10, 10 }, { 15, 10, 5 }, { 3, 7, 20 } }));
//		System.out.println(T.solution(new int[][] { { 3, 7, 20 }, { 10, 15, 5 }, { 19, 5, 6 }, { 10, 10, 10 },
//				{ 15, 10, 5 }, { 3, 7, 20 }, { 12, 12, 6 }, { 10, 20, 0 }, { 5, 10, 15 } }));
	}
}