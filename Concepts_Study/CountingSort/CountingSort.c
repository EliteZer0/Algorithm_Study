#include <stdio.h>

int main()
{   
    int n = 0;
    scanf("%d", &n);
    
    int data[n];
    int max = 0;
    
    //배열 입력
    for (int i = 0; i<n; i++){
        scanf("%d", &data[i]);
    }
    //최댓값 찾기
    for (int i = 0; i<n; i++){
        if(max<data[i]){
            max = data[i];
        }
    }
    //요소 카운트 배열 선언
    int count[max+1];
    //정렬 위치 배열 선언
    int new_count[max+1];
    //초기화
    for (int i = 0; i < max+1; i++) {
        count[i] = 0;
        new_count[i] = 0;
    }
    //요소 카운트
    for(int i = 0; i<n; i++){
        count[data[i]]++;
    }
    //정렬된 위치 찾기
    for (int i = 0; i<max+1; i++){
        new_count[0] = count[0];
        new_count[i+1] = new_count[i] + count[i+1];
    }
    
    int sort[n];
    //정렬
    for(int i = 0; i<n; i++){
        sort[new_count[data[i]]-1] = data[i];//정렬 위치는 1부터 시작 인덱스는 0부터 시작. -1 해줘야함.
            new_count[data[i]]--;//정렬 수 개수 감소
    }
    
    for (int i = 0; i<n; i++){
        printf("%d ", sort[i]);
    }

    return 0;
}