#include <stdio.h>

int main(void) {
    int m, n;
    scanf("%d", &m);
    scanf("%d", &n);

    //n을 a*100+b*10+c*1 로 표현해서 하는거네

    int a = n / 100;
    int b = n % 100 / 10;
    int c = n % 10;

    //printf("%d %d %d", a, b, c);

    printf("%d\n%d\n%d\n", m * c, m * b , m * a);
    printf("%d", m * a * 100 + m * b * 10 + m * c);
}