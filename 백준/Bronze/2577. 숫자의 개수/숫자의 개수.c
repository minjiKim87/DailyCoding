#include <stdio.h>

int main(void) {
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);
    int num = A * B * C;
    int cntArr[10] = { 0 }; //배열 초기화 헷갈리네
    int check = 1;
    int stNum = num;
    int tmp = 0;

    while (1) {
        tmp = stNum % 10;
        stNum = stNum / 10;
    
        if (stNum == 0 && tmp == 0)break;

        switch (tmp) {
        case 0:
            cntArr[0]++;
            break;
        case 1:
            cntArr[1]++;
            break;
        case 2:
            cntArr[2]++;
            break;
        case 3:
            cntArr[3]++;
            break;
        case 4:
            cntArr[4]++;
            break;
        case 5:
            cntArr[5]++;
            break;
        case 6:
            cntArr[6]++;
            break;
        case 7:
            cntArr[7]++;
            break;
        case 8:
            cntArr[8]++;
            break;
        case 9:
            cntArr[9]++;
            break;
        default:
            break;

        }

    }

    for (int i = 0; i < 10; i++) {
        printf("%d\n", cntArr[i]);
    }
}