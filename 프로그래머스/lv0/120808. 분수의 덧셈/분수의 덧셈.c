#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int denum1, int num1, int denum2, int num2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    /*
    denum1*num2 + denum2*num1
    num1*num2
    최대공약수 구하기
    */
    
    int denum_temp =  denum1*num2 + denum2*num1;
    int num_temp = num1*num2;
    int gcd=0;
    int* answer = (int*)malloc(1);
    
    for(int i =1 ; i<=denum_temp && i<=num_temp ; ++i){
        
        if(denum_temp%i==0 && num_temp%i==0)
            gcd = i;
    }
    
    answer[0] = denum_temp/gcd;
    answer[1] = num_temp/gcd;
    
    return answer;
}