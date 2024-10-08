import java.util.Arrays;

public class QuickSort {
	static int[] arr = {8,4,6,2,1,5,7,3};
	static int n = arr.length;
	
	public static void main(String[] args) {
		quickSort(0, n-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int left, int right) {
		if(left<right) {
			int pivot = partition(left, right);
			quickSort(left, pivot-1);
			quickSort(pivot+1, right);
		}
		
	}

	static int partition(int left, int right) {
		int pivot = arr[left];
		int L = left+1;
		int R = right;
		
		while(L<=R) {
			while(L<=R && arr[L] <= pivot) {
				L++;
			} 
			while(arr[R] > pivot) {
				R--;
			} 
			if(L<R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
			}
		}
		
		int temp = arr[left];
		arr[left] = arr[R];
		arr[R] = temp;
		
		return R;
	}
}

/*
 * 퀵정렬의 경우 O(n log n). 평균적으로는 가장 빠르나 워스트 케이스의 경우 O(n^2)
 * 분할정복 기법
 * 제자리 정렬
 * 불안정 정렬
*/