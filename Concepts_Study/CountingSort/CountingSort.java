import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] data = { 1, 1, 5, 8, 2, 2, 3, 3, 4, 4, 4 };
        int n = data.length;
        int maxNum = 0;

        System.out.println(Arrays.toString(data));

        for (int i = 0; i < n; i++) {
            if (data[i] > maxNum) {
                maxNum = data[i];
            }
        }

        int[] cntArr = new int[maxNum + 1];

        for (int i = 0; i < n; i++) {
            cntArr[data[i]]++;
        }

        System.out.println(Arrays.toString(cntArr));

        int[] idxArr = new int[maxNum + 1];

        for (int i = 1; i < maxNum + 1; i++) {
            idxArr[0] = cntArr[0];
            idxArr[i] = idxArr[i - 1] + cntArr[i];
        }

        System.out.println(Arrays.toString(idxArr));

        int[] sort = new int[n];

        for (int i = 0; i < n; i++) {
            sort[(idxArr[data[i]]) - 1] = data[i];
            idxArr[data[i]]--;
        }

        System.out.println(Arrays.toString(sort));

    }

}
