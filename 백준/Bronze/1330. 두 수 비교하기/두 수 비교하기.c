#include <stdio.h>

int main(void){
    int A, B;
    scanf("%d %d", &A, &B);
    int C = A-B;
    
    if(C>0){
        printf(">");
    }else if(C<0){
        printf("<");
    }else{
        printf("==");
    }
    
    
}