package javaLoveClub.ch1.p3_잃어버린강아지;

class Solution {
	static final int SIZE = 10;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static class Info {
		int x;
		int y;
		int dir;

		public Info(int x, int y, int dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}

//		@Override
//		public String toString() {
//			StringBuilder builder = new StringBuilder();
//			builder.append("Info [x=").append(x).append(", y=").append(y).append(", dir=").append(dir).append("]");
//			return builder.toString();
//		}
	}

	public int solution(int[][] board) {
		int answer = 0;
		Info man = null, dog = null;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (man != null && dog != null)
					break;

				if (board[i][j] == 2) {
					man = new Info(i, j, 0);
				} else if (board[i][j] == 3) {
					dog = new Info(i, j, 0);
				}
			}
		}
//		System.out.println("man: " + man);
//		System.out.println("dog: " + dog);

		for (int i = 0; i < 10000; i++) {
			if (man.x == dog.x && man.y == dog.y) {
				answer = i;
				break;
			}

			man = go(board, man);
			dog = go(board, dog);
		}

		return answer;
	}

	Info go(int[][] board, Info obj) {
		int x = obj.x, y = obj.y, dir = obj.dir;
		int nx = x + dx[dir];
		int ny = y + dy[dir];

		if (nx < 0 || nx >= SIZE || ny < 0 || ny >= SIZE || board[nx][ny] == 1)
			return new Info(x, y, (dir + 1) % 4);

		return new Info(nx, ny, dir);
	}

	public static void main(String[] args) {
		Solution T = new Solution();

		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 } };
		System.out.println(T.solution(arr1));

		int[][] arr2 = { { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 3 } };
		System.out.println(T.solution(arr2));
	}
}