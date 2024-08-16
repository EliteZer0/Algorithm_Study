import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1244 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int switchCounts = Integer.parseInt(br.readLine());
		int[] switchsState = new int[switchCounts];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < switchCounts; i++) {
			switchsState[i] = Integer.parseInt(st.nextToken());
		}
		int studentCounts = Integer.parseInt(br.readLine());
		int[][] studentsState = new int[studentCounts][2];//row : gender col: getNumber
		
		for (int i = 0; i < studentCounts; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				studentsState[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		for (int i = 0; i < studentCounts; i++) {
			int gender = studentsState[i][0];
			int getNum = studentsState[i][1];
			//남학생 로직
			if(gender == 1) {
				for (int j = 0; j < switchCounts; j++) {
					if((j+1)%getNum == 0) {
						if(switchsState[j] == 0) switchsState[j] = 1;
						else switchsState[j] = 0;
					}
				}
			}
			//여학생 로직 -> 좌우가 대칭이면 대칭인 곳까지 모두 전환 아니면 본인 스위치만 전환
			else {
				if(switchsState[getNum-1] == 0) switchsState[getNum-1] = 1;
				else switchsState[getNum-1] = 0;
				
				for (int j = 1; j < switchCounts; j++) {			
					if(getNum-1-j>=0 && getNum-1+j<switchCounts && switchsState[getNum-1-j] == switchsState[getNum-1+j]) {
						
						if(switchsState[getNum-1-j] == 0) {
							switchsState[getNum-1-j] = 1;
							switchsState[getNum-1+j] = 1;
						}
						else {
							switchsState[getNum-1-j] = 0;
							switchsState[getNum-1+j] = 0;
						}	
					}else {
						//끝까지 확인하고 대칭으로 값이 같은 경우에도 변환해서 틀림. 로직 수정하면서 if문에서 != 조건 빼면서 생긴 실수.
						break;
					}
				}
			}
		}
		// 출력형식 확인 안 해서 대차게 틀림. 출력형식 꼭 확인할 것 
		if(switchCounts/20 > 0) {
			for(int i = 0; i<(switchCounts/20)+1; i++) {
				for (int j = 20*i; j < 20*(i+1); j++) {
					if(j<switchCounts) {
						System.out.printf("%d ", switchsState[j]);
					}else {
						break;
					}
				}
				System.out.println();
			}
		}else {
			for (int i = 0; i < switchCounts; i++) {
				System.out.printf("%d ", switchsState[i]);
			}
		}
	}
}
