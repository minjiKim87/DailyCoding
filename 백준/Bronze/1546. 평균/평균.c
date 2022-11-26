#include <stdio.h>

int main(void) {
    int N = 0;
    scanf("%d", &N);
    float arr[N];
    int M = 0;

    for (int i = 0; i < N; i++) {
        scanf("%f", &arr[i]);
        if (arr[i] >= M)M = arr[i];
    }
    //printf("M : %d\n", M);
    float average = 0;

    for (int i = 0; i < N; i++) {
        arr[i] = (arr[i] / M) * 100;
       // printf("%f\n", arr[i]);
        average += arr[i];
    }
    average = average / N;

    printf("%f", average);
}