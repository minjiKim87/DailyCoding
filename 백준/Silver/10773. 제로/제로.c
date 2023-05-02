#define _CRT_SECURE_NO_WARNINGS  
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int stack[100001]; 
int cnt = 0;

void push(int n) {
    stack[cnt] = n;
    cnt++;
}

void pop() {
    //pop이 나오는건 지울 수 있는 수가 최소 1개 있음을 문제에서 보장함

      cnt--; //? 하나 줄이기 이거만 하면 되나?
   
}


void empty() {
    if (cnt == 0)
        printf("1");
    else
        printf("0");
}

int main()
{
    char* order = malloc(sizeof(char) * 10);    
    int K = 0;
    

    scanf("%d", &K);
        

    for (int i = 0; i < K; i++) {
        int n = 0;
        scanf("%d", &n);
        if (n == 0) {
            pop();
        }
        else {
            stack[cnt] = n;
            cnt++;
        }
     
    }

    int sum = 0;

    for (int i = 0; i < cnt; i++) {
        sum += stack[i];
    }
   
    printf("%d", sum);
    free(order);    

    return 0;
}
