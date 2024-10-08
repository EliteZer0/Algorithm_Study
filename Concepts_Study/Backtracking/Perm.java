import java.util.Arrays;

public class Perm {
	static int n;
	static int r;
	static int[] num;
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {
		n = 5;
		r = 3;
		num = new int[n];
		
		for(int i = 1; i<=n; i++) {
			num[i-1] = i;
		}
		
		arr = new int[r];
		visited = new boolean[n];
		
		perm(0);
	}

	static void perm(int cnt) {
		if (cnt == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for (int i = 0; i < num.length; i++) {
			if(!visited[i]) {
				arr[cnt] = num[i];
				visited[i] = true;
				perm(cnt+1);
				visited[i] = false;
			}
		}
	}
	
}
