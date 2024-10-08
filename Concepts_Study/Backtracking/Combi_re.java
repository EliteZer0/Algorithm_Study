import java.util.Arrays;

public class Combi_re {
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
		
		combiRe(0,0);
	}

	static void combiRe(int cnt, int idx) {
		if(cnt == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for (int i = idx; i < n; i++) {
			arr[cnt] = num[i];
			combiRe(cnt+1, i);
		}
	}
}
