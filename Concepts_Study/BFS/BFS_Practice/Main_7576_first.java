package BFS_Practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576_first {
	static int row;
	static int col;
	static int day;
	static int[][] box;
	static boolean[][] visited;
	static boolean[][] changed;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		
		box = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		day = 0;
		visited = new boolean[row][col];
		changed = new boolean[row][col];
		
		Queue<int[]> tomato = new LinkedList<>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(visited[i][j]) continue;
				if(box[i][j] == 1) {
					tomato.offer(new int[] {i, j});
				}
			}
		}
		
		bfs(tomato);
		
		int print = 0;
		
		loop :
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(box[i][j] == 0) {
					print = -1;
					break loop;
				}
				if(changed[i][j]) {
					print = 1;
					break loop;
				}
			}
		}
		if(print == -1) {
			System.out.println(print);
		} else if(print == 0) {
			System.out.println(print);
		}else {
			System.out.println(day-1);
		}
	}
	
	static int[] dr = {-1,1,0,0};//상하좌우
	static int[] dc = {0,0,-1,1};
	static void bfs(Queue<int[]> que) {		
		while(!que.isEmpty()) {
			int cycle = que.size();
			for (int i = 0; i < cycle; i++) {
				int[] cur = que.poll();
				int curRow = cur[0];
				int curCol = cur[1];
				visited[curRow][curCol] = true;
				
				for (int d = 0; d < 4; d++) {
					int moveRow = curRow+dr[d];
					int moveCol = curCol+dc[d];
					
					if(!check(moveRow, moveCol)) continue; 
					if(visited[moveRow][moveCol]) continue;
					
					if(box[moveRow][moveCol] == 0) {
						visited[moveRow][moveCol] = true;
						changed[moveRow][moveCol] = true;
						box[moveRow][moveCol] = 1;
						que.offer(new int[] {moveRow, moveCol});
					}
				}
			}
			day++;			
		}
	}

	static boolean check(int r, int c) {
		return r<row && r>=0 && c<col && c>=0;
	}
}
