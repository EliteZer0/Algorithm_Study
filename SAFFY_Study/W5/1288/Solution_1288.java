import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Solution_1288 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tcNum = 1; tcNum < T+1; tcNum++) {
			int N = Integer.parseInt(br.readLine());
			int[] count = new int[10];
			int i = 1;
			while(true) {
				boolean allCount = true;
				
				String num = String.valueOf(N);
				char[] nums = num.toCharArray();
				
//				System.out.println("String num : " + num);
//				System.out.println("char[] nums : " + Arrays.toString(nums));
				
				for(int j = 0; j<nums.length; j++) {
					count[Integer.parseInt(String.valueOf(nums[j]))] ++;
				}
				
//				System.out.println("int[] count : " + Arrays.toString(count));
				
				for(int j =0; j<count.length; j++) {
					if(count[j]==0) {
						allCount = false;
						continue;
					}
				}
				
				if(!allCount) {
					N/=i;
					i++;
					N*=i;
				}else {
					break;
				}
			}
			System.out.printf("#%d %d\n", tcNum, N);
			
		}
	}
}
