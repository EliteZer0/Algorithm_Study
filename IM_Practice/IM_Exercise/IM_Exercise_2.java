import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//분반 학생 수 최댓값과 최솟값의 차 가장 작게 만들기
public class IM_Exercise_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tcNum = 1; tcNum < TC+1; tcNum++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			int[] scores = new int [n]; 
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				scores[i] = Integer.parseInt(st.nextToken());
			}
			
			int cClassCount = 0;//a,b,c 우수 보통 부진
			int bClassCount = 0;
			int aClassCount = 0;
			int score1 = 0;
			int score2 = 0;
			int minDif = n;
			boolean isDividable = true;
			
			Arrays.sort(scores);
			
			for (int i = 1; i < n; i++) {
				cClassCount = 0;
				bClassCount = 0;
				aClassCount = 0;
				
				score1 = scores[i];
				for (int j = n-1; j >=0; j--) {
					score2 = scores[j];
					for (int k = 0; k < n; k++) {
						if(scores[k]<score1) {
							cClassCount++;
						}else if(score1<=scores[k] && scores[k]<score2) {
							bClassCount++;
						}else if(score2<=scores[k]){
							aClassCount ++;
						}
					}
					int maxCnt = Math.max(aClassCount, Math.max(bClassCount, cClassCount));
					int minCnt = Math.min(aClassCount, Math.min(bClassCount, cClassCount));
					int difference = maxCnt - minCnt;
					if(minDif>difference) {
						minDif = difference;
						if(aClassCount<min || aClassCount>max || bClassCount<min || bClassCount>max || cClassCount<min || cClassCount>max) {
							isDividable = false;
						}else {
							isDividable = true;
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tcNum).append(" ");
			if(isDividable) {
				sb.append(minDif);
				System.out.println(sb.toString());
			}else {
				sb.append(-1);
				System.out.println(sb.toString());
			}
		}
	}
}