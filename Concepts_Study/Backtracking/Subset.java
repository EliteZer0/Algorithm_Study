
public class Subset {
	static int n;;
	static int[] num;
	static boolean[] visited;
	
	public static void main(String[] args) {
		n = 5;
		
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = i+1;
		}
		
		visited = new boolean[n];
		
		subset(0);
	}

	static void subset(int cnt) {
		if(cnt == n) {
			for (int i = 0; i < n; i++) {
				if(visited[i]) {
					System.out.print(num[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		
		visited[cnt] = true;
		subset(cnt+1);
		visited[cnt] = false;
		subset(cnt+1);
	}
}
