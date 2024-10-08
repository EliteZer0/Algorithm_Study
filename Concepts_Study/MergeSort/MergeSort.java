 import java.util.Arrays;

public class MergeSort {
	static int[] arr = {8,4,6,2,1,5,7,3};
	static int n = arr.length;
	static int temp[] = new int[n];
	public static void main(String[] args) {
		mergeSort(0, n-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void mergeSort(int left, int right) {
		if(left<right) {
			int mid = (left + right)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge(left, mid, right);
		}
	}

	static void merge(int left, int mid, int right) {
		int L = left;
		int R = mid+1;
		int idx = left;
		
		while(L <= mid && R<=right) {
			if(arr[L] <= arr[R]) {
				temp[idx] = arr[L];
				idx++;
				L++;
			}else {
				temp[idx] = arr[R];
				idx++;
				R++;
			}
		}
		
		if(L<= mid) {
			for(int i = L;i<= mid; i++) {
				temp[idx] = arr[i];
				idx++;
			}
		}else {
			for(int i = R; i<= right; i++) {
				temp[idx] = arr[i];
				idx++;
			}
		}
		
		for(int i = left; i<= right; i++) {
			arr[i] = temp[i];
		}
	}
}
/*
 * 병합정렬의 시간복잡도는 O(n log n)
 * 분할정복 기법
 * 연결리스트의 경우 가장 효율적
 * 안정정렬
*/