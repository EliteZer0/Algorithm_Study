package BFS_Practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//미완
public class Main_4179 {
	static int row;
	static int col;
	static char[][] maze;
	static boolean escape;
	static Queue<int[]> jihoon;
	static Queue<int[]> fire;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		maze = new char[row][col];
		jihoon = new LinkedList<>();
		fire = new LinkedList<>();
		
		for (int i = 0; i < row; i++) {
			maze[i] = br.readLine().toCharArray();
			for (int j = 0; j < col; j++) {
				if(maze[i][j] == 'J') {
					jihoon.offer(new int[] {i,j});
				}
				if(maze[i][j] == 'F') {
					fire.offer(new int[] {i,j});
				}
			}
			System.out.println(maze[i]);
		}
		
		escape = false;
		
		bfs(jihoon, fire);
	}

	static void bfs(Queue<int[]> p, Queue<int[]> f) {
		while(!p.isEmpty()) {
			 
		}
	}

	static boolean check(int r, int c) {
		return r>=0 && r<row && c>=0 && c<col;
	}
}
