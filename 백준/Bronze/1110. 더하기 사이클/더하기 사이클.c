#include <stdio.h>

int main(void) {
    int num;
    
    int num2 = 0;
    int cnt = 0;
    int tmp = 0;
    scanf("%d", &num);
    int numStored = num;

 

   
        while (num2!=num) {
           
            tmp = numStored % 10 + numStored / 10; //printf("tmp : %d\n", tmp);
            num2 = tmp % 10 + (numStored % 10) * 10; //printf("num2 : %d\n", num2);
            cnt++;
            numStored = num2;
        }
    
        if (num == 0)cnt = 1;

    printf("%d", cnt);

}