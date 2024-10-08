#include <stdio.h>

	int main() {
	  
	  int n = 0;
    scanf("%d", &n);
    
    int data[n]; 
    for(int i=0; i<n; i++){
        scanf("%d", &data[i]);
    }
    
    int temp = 0;

    for(int i = 0; i < n-1; i++){
    	for(int j = 0; j< n-1-i; j++){
    		if(data[j] < data[j+1]){//부등호 방향을 반대로 바꾸면
    			temp = data[j];
    			data[j] = data[j+1];
    			data[j+1] = temp;
    			//큰 숫자가 앞으로 오는 내림차순 완성
    		}
    	}
    }
    
    for(int i=0; i<n; i++){
        printf("%d ", data[i]);
    }
    
    return 0;
}