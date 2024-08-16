import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//엘사의 전등 스위치
public class IM_practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tcNum = 1; tcNum < T+1; tcNum++) {
			int switchs = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] switchState = new int[switchs];
			for (int i = 0; i < switchs; i++) {
				switchState[i] = Integer.parseInt(st.nextToken());
			}
			
			int onOffCnt = 0;
			
			for (int i = 0; i < switchs; i++) {
				if(switchState[i] == 1) {
					for (int j = 0; j < switchs ; j++) {
						if((j+1)%(i+1) == 0) {
							if(switchState[j] == 1) switchState[j] = 0;
							else switchState[j] = 1;							
						}
					}
					onOffCnt++;
				}
			}
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tcNum).append(" ").append(onOffCnt);
			System.out.println(sb.toString());
		}
	}
}
