#include <stdio.h>

int main(){

    int n = 0;
    scanf("%d", &n);
    
    int data[n]; //n개의 값을 가지는 배열 선언
    for(int i=0; i<n; i++){
        scanf("%d", &data[i]);
    }
    
    int temp = 0;//임시로 데이터 저장할 변수 선언

    for(int i = 0; i < n-1; i++){//n-1만큼 반복
    	for(int j = 0; j< n-1-i; j++){//n-1만큼 비교하다 마지막 반복엔 1번 비교
    		if(data[j] > data[j+1]){
    			temp = data[j]; //data[j]를 잠시 저장
    			data[j] = data[j+1]; //data[j+1]을 data[j]의 위치로 이동
    			data[j+1] = temp;	//data[j+1]의 자리에 저장해둔 data[j]를 입력.
    			//큰 숫자가 뒤로 밀리는 오름차순 완성
    		}
    	}
    }
    
    for(int i=0; i<n; i++){
        printf("%d ", data[i]);
    }
    
    return 0;
}