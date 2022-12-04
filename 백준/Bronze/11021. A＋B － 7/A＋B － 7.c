#include <stdio.h>

int main(void){
    int T;
    scanf("%d", &T);
    int arr[T];
    int arr2[T];
    
    for(int i =0;i<T;i++){
        scanf("%d %d", &arr[i], &arr2[i]);
    }
    
    for(int i =0;i<T;i++){
        printf("Case #%d: %d\n", i+1, arr[i]+arr2[i]);
    }
}