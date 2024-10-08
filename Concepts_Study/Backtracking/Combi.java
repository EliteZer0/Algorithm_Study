import java.util.Arrays;

public class Combi {
	static int n;
	static int r;
	static int[] num;
	static int[] arr;
	
	public static void main(String[] args) {
		n = 5;
		r = 3;
		num = new int[n];
		
		for(int i = 1; i<=n; i++) {
			num[i-1] = i;
		}
		
		arr = new int[r];
		
		combi(0,0);
	}

	static void combi(int cnt, int idx) {
		if(cnt == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for (int i = idx; i < n; i++) {
			arr[cnt] = num[i];
			combi(cnt+1, i+1);
		}
	}
}
