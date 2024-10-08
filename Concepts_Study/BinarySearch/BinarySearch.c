#include <stdio.h>

int main()
{   
    int n = 0;
    scanf("%d", &n);
    int data[n];
    
    for (int i = 0; i<n; i++){
        scanf("%d", &data[i]);
    }
    
    printf("찾으려는 수를 입력하세요: ");
    int answer = 0;
    scanf("%d", &answer);
    
    int exist = 0;
    
    //버블정렬 활용해 오름차순으로 정리
    for(int i = 1; i<n; i++){
        for(int j =0; j<n-i; j++){
            if(data[j]>data[j+1]){
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }
        }
    }
    
    //이진탐색
    int left = 0;
    int right = n-1;
    
    while(left <= right){
        int mid = (left+right)/2;
        if(data[mid] == answer){
            exist = 1;
            break;
        } else if (data[mid]>answer){
            right = mid - 1;
        } else{
            left = mid + 1;
        }
    }
    
    if(exist == 0){
        printf("false\n");    
    }else{
        printf("true\n");
    }
    
    return 0;
}