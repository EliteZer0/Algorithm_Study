package SelectionSort_Practice;
import java.util.Scanner;

public class Main_23882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        int count = 0;
        boolean isPrintable = false;
        int maxIndex = 0;

        for (int i = n-1; i > 0; i--) {
            maxIndex = i;
            
            for (int j = 0; j < i+1; j++) {
                if(data[maxIndex]<data[j]){
                    maxIndex = j;
                }
            }

            if(maxIndex != i){
                int temp = data[i];
                data[i] = data[maxIndex];
                data[maxIndex] = temp;
                count ++; 
            }

            if(count == k){
                isPrintable = true;
                break;
            }
        }

        if(isPrintable){
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", data[i]);
            }
        }else{
            System.out.println(-1);
        }
    }
}
