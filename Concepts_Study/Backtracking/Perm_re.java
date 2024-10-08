import java.util.Arrays;

public class Perm_re {
	static int n;
	static int r;
	static int[] num;
	static int[] arr;
	
	public static void main(String[] args) {
		n = 5;
		r = 3;
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = i+1;
		}
		arr = new int[r];
		
		permRe(0);
	}

	static void permRe(int cnt) {
		if(cnt == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[cnt] = num[i];
			permRe(cnt+1);
		}
	}
}
